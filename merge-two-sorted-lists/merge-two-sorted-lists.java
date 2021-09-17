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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null)
            return null;
        
        // create result LinkedList
        ListNode resultList = new ListNode(0);
        ListNode prev = resultList;

        while(l1 != null || l2 != null) {
            if(l1 == null) {
                prev.next = l2;
                return resultList.next;
            }
            if(l2 == null) {
                prev.next = l1;
                return resultList.next;
            }
            
            if(l2.val >= l1.val) {
                prev.next = l1;
                l1 = l1.next;
            }
            else {
                prev.next = l2;
                l2 = l2.next;
            }
            
            prev = prev.next;
        }
        
      return resultList.next;
    }
}