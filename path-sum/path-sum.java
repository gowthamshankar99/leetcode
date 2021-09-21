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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null) {
            return false;
        }
        
        targetSum = targetSum - root.val;
        
        if(root.left == null && root.right == null)
        {
            if(targetSum == 0) {
                return true;
            } else {
                return false;
            }
        }    
        
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
    
    public int hasPathSum2(TreeNode root, int targetSum) {
        if(root == null) {
            System.out.println(targetSum);
            return targetSum;
        }  
        
        if(root.left == null && root.right == null)
            return targetSum;
        
        if(root.left != null || root.right != null) {
             if(root.left == null) {
                 targetSum = targetSum + Math.max(0, root.right.val);
                 return hasPathSum2(root.right, targetSum);
                 
             } 
            if(root.right == null) {
                targetSum = targetSum + Math.max(0, root.left.val);
                return hasPathSum2(root.left, targetSum);
            }
            
            targetSum = targetSum + Math.max(root.right.val, root.left.val);
            if(Math.max(root.right.val, root.left.val) == root.left.val)
                return hasPathSum2(root.left, targetSum);
            else 
                return hasPathSum2(root.right, targetSum);
            
        }
        return 0;
    }
}