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
    public void reorderList(ListNode head) {
        
        // use two pointer technique to find the midpoint
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        System.out.println(slow.val);
        int midValue = slow.val;
        
        ListNode prev = null;
        ListNode curr = slow,next_node;
        
        while(curr != null) {
            next_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_node;
        }
        
        int i = 0;
        ListNode first = head; ListNode second = prev;
        
        while (second.next != null) {
          next_node = first.next;
          first.next = second;
          first = next_node;

          next_node = second.next;
          second.next = first;
          second = next_node;
        }
        
    }
}