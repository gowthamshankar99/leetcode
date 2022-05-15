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
    
    
    
    	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
			return false;
        if(root.val == subRoot.val && checkEqual(root, subRoot))
            return true;
        
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    private boolean checkEqual(TreeNode subTree, TreeNode subRoot) {
        if(subTree == null && subRoot == null) 
            return true;
        if(subTree == null || subRoot == null)
            return false;
        if(subTree.val != subRoot.val)
            return false;

        return checkEqual(subTree.left, subRoot.left) && checkEqual(subTree.right, subRoot.right);
    }
    
    
    public boolean isSubtree2(TreeNode root, TreeNode subRoot) {
        if(root == null)
            return false;
        
        if(same(root, subRoot))
            return true;
        else {
            return same(root.left, subRoot) || same(root.right, subRoot);
        }
        
    }
    
    
    
    public boolean same(TreeNode p, TreeNode q) {
        
        if(p == null || q == null) {
            return (p == null) && (q == null);
        }        
        
        else if(p.val == q.val) {
            return same(p.left, q.left) && same(p.right, q.right);
        } else {
            return false;    
        }
        
    }
}