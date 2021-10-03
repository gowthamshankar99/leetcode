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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        
        System.out.println(height(root.left));
        System.out.println(height(root.right));
        
        int difference = Math.abs(height(root.left)-height(root.right));
        
        if(difference > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    public int height(TreeNode root) {
        if(root == null) 
            return 0;
        
        int leftHeight = 1 + height(root.left);
        int rightHeight = 1 + height(root.right);

        
        return Math.max(leftHeight, rightHeight);
    }
}