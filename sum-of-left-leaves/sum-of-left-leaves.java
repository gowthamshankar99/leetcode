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
    public int sumOfLeftLeaves(TreeNode root) {
        int[] result = new int[]{0};
        
        traverse(root, result);
        
        return result[0];
    }
    
    public void traverse(TreeNode root, int[] result)  {
        if(root == null)
            return;
        
        if(root.left != null && (root.left.right ==null && root.left.left  == null)) {
            //System.out.println(root.left.val);
            result[0] = result[0] + root.left.val;
       }
        traverse(root.left, result);
        traverse(root.right, result);
    }
}