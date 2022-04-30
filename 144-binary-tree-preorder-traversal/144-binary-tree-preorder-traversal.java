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
    
    List<Integer> resultList = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null) {
            return resultList;   
        }
        
        if(root != null) {
            //System.out.println(root.val);
            resultList.add(root.val);
        }
        
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return resultList;
    }
}