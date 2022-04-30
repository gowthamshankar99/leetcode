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
    public int answer;
    public int maxDepth(TreeNode root) {
         answer = 0;
         max2(root, 1);
         return answer;
    }
    
    public void max2(TreeNode root, int depth) {
        if(root == null) {
             return;
         }
        
        if(root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        
        max2(root.left, depth+1);
        max2(root.right, depth+1);

    }
    
    private void maximum_depth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }
}