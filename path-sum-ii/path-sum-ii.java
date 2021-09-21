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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> innerResult = new ArrayList<>();
        validate(root, targetSum, result, innerResult);
        return result;
        
        
        
    }
    
    public void validate(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> innerResult) {
        
        if(root == null) {
            return;
        }
        
        innerResult.add(root.val); 
           
        if(targetSum == root.val && root.left == null && root.right == null) {
                result.add(new ArrayList<>(innerResult));
        } else {
            validate(root.left, targetSum-root.val, result, innerResult);
            validate(root.right, targetSum-root.val, result, innerResult);
        }
        
        innerResult.remove(innerResult.size()-1);
    }
}