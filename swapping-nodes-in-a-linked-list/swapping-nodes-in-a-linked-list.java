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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode subElement = head;
        int size = getSize(subElement);
        
        ListNode current = head;
        int difference = size-k;
        int counter = 1;
        ListNode frontNodeValue = null;
        ListNode backNodeValue = null;
        while(current != null) {
            if(counter==k) {
                 frontNodeValue = current;
                 
            }
            if(counter==difference+1) {
                backNodeValue = current;
                // found the backNode
                
            }
            counter++;
            current = current.next;
        }
        
        int temp = backNodeValue.val;
        backNodeValue.val = frontNodeValue.val;
        frontNodeValue.val = temp;
        
        System.out.println();
            
        return head;
    }
    
    public int getSize(ListNode head) {
        int size = 0;
        while(head!= null) {
            size++;
            head = head.next;
        }
        return size;
    }
    
}