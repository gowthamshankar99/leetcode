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
    // resultList
    List<Integer> resultList = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return resultList;
        
        inorderTraversal(root.left);
        if(root != null)
            resultList.add(root.val);
        inorderTraversal(root.right);

        return resultList;
    }
}