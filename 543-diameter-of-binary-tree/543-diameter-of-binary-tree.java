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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null)
            return 0;
        iterate(root);
        return diameter;
    }
    
    public int iterate(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int right = iterate(root.right);
        int left = iterate(root.left);
        diameter = Math.max(diameter, (left+right));
        
        return 1 + Math.max(left, right);
    }
}