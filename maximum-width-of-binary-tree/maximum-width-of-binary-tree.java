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
    HashMap<Integer, Integer> map;
    int maxWidth; 
    public int widthOfBinaryTree(TreeNode root) {
        maxWidth = 0;
        map = new HashMap<Integer, Integer>();
        traverse(root, 0, 0);

        return maxWidth;
    }
    
    public void traverse(TreeNode root, int depth, int position) {
        
        if(root == null)
            return;
        
        map.computeIfAbsent(depth, x->position);
        maxWidth = Math.max(maxWidth, position-map.get(depth) + 1);
        
        traverse(root.left, depth+1, position*2);
        traverse(root.right, depth+1, (position*2)+1);
        
    }
}
