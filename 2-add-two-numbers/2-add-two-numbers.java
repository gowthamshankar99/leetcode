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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 =  l1; 
        ListNode list2 =  l2; 
        
        ListNode resultList = new ListNode(-1);
        ListNode curr = resultList;
        int numToAdd = 0;
        ListNode node = null;
        
        while(list1 != null && list2 != null) {
            
            // add values
            int newVal = list1.val + list2.val + numToAdd;
            int newValToAdd = (newVal%10);
            
            // check if the value is more than 10 
            numToAdd = newVal/10;
            
            // create a new Node
            node = new ListNode(newValToAdd%10);
            curr.next = node;
            curr = curr.next;
            
            // move the pointers
            list1 = list1.next;
            list2 = list2.next;
        }
        
       while(list1 != null) {
           int val = list1.val + numToAdd;
           int reminder = val%10;
           numToAdd = val/10;
           
           node = new ListNode(reminder);
           curr.next = node;  
           curr = curr.next;
           list1 = list1.next;
       }
        

        
       while(list2 != null) {
           int val = list2.val + numToAdd;
           int reminder = val%10;
           numToAdd = val/10;
           
           node = new ListNode(reminder);
           curr.next = node;  
           curr = curr.next;
           list2 = list2.next;
       }        
        
       if(numToAdd > 0) 
           curr.next = new ListNode(numToAdd);
        
       return resultList.next;
    }
}