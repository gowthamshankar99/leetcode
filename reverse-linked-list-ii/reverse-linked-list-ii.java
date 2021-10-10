/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null)
            return null;
        
        ListNode current_node = head;
        ListNode prev = null;
        
        while(left > 1) {
            prev = current_node;
            current_node = current_node.next;
            left--;
            right--;
        }
        
        ListNode front = prev;
        ListNode tail = current_node;
        
        while(right > 0) {
            //save next node 
            ListNode next = current_node.next;
            current_node.next = prev;
            prev = current_node;
            current_node = next;
            right--;
            
        }
        
        
        if(front != null) {
            front.next = prev;
        } else {
            head = prev;
        }
        
        tail.next = current_node;
        
        return head;
        
    }
}