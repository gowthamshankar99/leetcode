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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // result list 
        ListNode head = new ListNode(-1);
        ListNode resultList = head;
        ListNode node = null;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                // create a node 
                node = new ListNode(list1.val);
                list1 = list1.next;
                resultList.next = node;
                resultList = resultList.next;
            } else {
                node = new ListNode(list2.val);
                list2 = list2.next;
                resultList.next = node;
                resultList = resultList.next;
            }
        }
        
        
        resultList.next = list1 == null ? list2 : list1;
        
        
        return head.next;
    }
}