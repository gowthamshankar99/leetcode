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
    public ListNode deleteDuplicates(ListNode head) {
        
        
        if(head == null)
            return null;
        
        // create result list
        ListNode current = new ListNode(-1);
        ListNode result = current;
        
        Set<Integer> set = new LinkedHashSet<Integer>();
        Set<Integer> dupSet = new LinkedHashSet<Integer>();
        ListNode prev = head;
        
        while(prev != null) {
            if(dupSet.contains(prev.val)) {
                  set.remove(prev.val);
            } else {
                set.add(prev.val);
                dupSet.add(prev.val);
            }
            prev = prev.next;
        }
        
        // iterate through the set and create the list again
    
        for(int val : set) {
            ListNode node = new ListNode(val);
            result.next = node;
            result = result.next;
        }
        
        return current.next;
    }
}