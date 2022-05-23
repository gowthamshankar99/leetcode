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
    public ListNode sortList(ListNode head) {
        
        // build using heap sort 
        //Queue<ListNode> queue = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
        Queue<ListNode> queue = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
        
        ListNode curr = head;
        while(curr != null) {
            queue.add(curr);
            curr = curr.next;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode newDummy = dummy;
        
        while(!queue.isEmpty()) {
            // create a new node = not neccessary ?
            ListNode n = queue.remove();
            newDummy.next = new ListNode(n.val);
            newDummy = newDummy.next;
        }
        
        return dummy.next;
        
        
    }
}