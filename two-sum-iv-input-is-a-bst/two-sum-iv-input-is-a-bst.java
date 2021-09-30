/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
        if(root == null)
            return false;
        
        // result array 
        List<Integer> list = new ArrayList<Integer>();
        
        traverse(root, list, k);

        // list is already sorted
        
        int low = 0;
        int high = list.size()-1;
        
        while(low < high) {
             if(list.get(low) + list.get(high) == k) {
                 return true;
             } else if(list.get(low) + list.get(high) > k) {
                 high--;
             } else {
                 low++;
             }
        }
        
        return false;
        
    }
    
    public void traverse(TreeNode root, List<Integer> list, int k) {
        if(root == null) {
            return;
        }
    
        // in order traversal 
        traverse(root.left, list, k);
        list.add(root.val);
        traverse(root.right, list, k);
    }
}