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
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            ListNode next_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_node;
        }
        
        return prev;
        
    }
    
    public ListNode naiveSolutionUsingStack(ListNode head) {
        
        // create a stack
        Stack<Integer> stack = new Stack<>();
        
        ListNode curr = head;
        
        while(curr != null) {
           // System.out.println(curr.val);
            stack.add(curr.val);
            curr = curr.next;
        }
        
        ListNode newHead = new ListNode(-1);
        ListNode curr2 = newHead;
        
        
        while(!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            curr2.next = node;
            curr2 = curr2.next;
            
        }
            
        return newHead.next;
    }
}