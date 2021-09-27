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
        // Base case
         if(head == null) {
             return null;
         }

        /*
            Initialize three pointers prev as NULL, curr as head and next as NULL.
            Iterate through the linked list. In loop, do following. 
            // Before changing next of current, 
            // store next node 
            next = curr->next
            // Now change next of current 
            // This is where actual reversing happens 
            curr->next = prev 
            // Move prev and curr one step forward 
            prev = curr 
            curr = next
        */
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
    
    public ListNode reverseList2(ListNode head) {
        // Base case
         if(head == null) {
             return null;
         }

        
        // create a stack 
        
        Stack<ListNode> stack = new Stack<ListNode>();
     
        ListNode result = new ListNode(-1);
        
        // iterate through the list 
        while(head != null) {
            // push items into the stack 
            stack.push(head);
            head = head.next;
        }
        
        head = result;
        
        // pop items from the stack and create a new linkedlist
         while(!stack.isEmpty()) {
             // create a new list
             ListNode current = stack.pop();
             head.next = new ListNode(current.val);
             head = head.next; 
         }
        
        // return the linkedlist
        
        return result.next;
    }
    
    
    
}