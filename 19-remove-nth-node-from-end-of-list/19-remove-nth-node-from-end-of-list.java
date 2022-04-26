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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode curr = head;
        int size = 0;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        System.out.println(size);
        
        int frontSize = size - n;
        
        
        // reset curr
        curr = dummy;
        size = 0;
        while(frontSize > 0) {
            frontSize--;
            curr = curr.next;            
        }
        
        curr.next = curr.next.next;
    
        return dummy.next;
    }
}