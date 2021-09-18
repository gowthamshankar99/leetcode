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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int i=0;i<lists.length;i++) {
             ListNode head = lists[i];
             while(head != null) {
                  queue.add(head.val);
                  head = head.next;
             }
        }
        
        // create a list
        ListNode newlist = new ListNode(-1);
        ListNode prev = newlist;
        
        while(!queue.isEmpty()) {
            prev.next = new ListNode(queue.remove());
            prev = prev.next;
        }
        
        return newlist.next;
    }
}