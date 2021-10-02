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
    public ListNode swapPairs(ListNode head) {
        if(head == null)
          return head;

        
        // senitenel node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode current = dummy;
        
        while(current.next != null && current.next.next != null) {
            ListNode firstNode = current.next;
            ListNode secondNode = current.next.next;
            firstNode.next = secondNode.next;
            
            current.next = secondNode;
            current.next.next = firstNode;
            
            current = current.next.next;
        }
        
        return dummy.next;
        
      

    }
}