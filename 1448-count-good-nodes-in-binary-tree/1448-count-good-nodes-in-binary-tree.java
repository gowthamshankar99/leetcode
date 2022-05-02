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
    int answer = 0;
    public int goodNodes(TreeNode root) {
        checkCounts(root, Integer.MIN_VALUE);
        
        return answer;
    }
    
    public void checkCounts(TreeNode root, int currentMax) {
        if(root.val >= currentMax) {
            currentMax = root.val;
            answer++;
        }
        
        if(root.left != null) {
            checkCounts(root.left, currentMax);
        }
        
        if(root.right != null) {
            checkCounts(root.right, currentMax);
        }
    }
    

}