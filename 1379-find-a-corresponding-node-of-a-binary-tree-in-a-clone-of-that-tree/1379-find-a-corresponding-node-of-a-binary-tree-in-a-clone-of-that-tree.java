/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode res; 
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null) {
            return null;
        }  
        
        iterate(cloned, target);
        
        return res;
    }
    
    public void iterate(TreeNode root, TreeNode target) {
        if(root == null) 
            return;
        if(root != null && root.val == target.val) {
            res = root;
            return;
        }
        
        iterate(root.left, target);
        iterate(root.right, target);
        
        return;
    }
}