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
    int count = 0;
    List<Integer> list = new ArrayList<Integer>();
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root == null) 
            return 0;
        
        calculatePath(root,targetSum);
        
        return this.count;
        
    }
    
    public void calculatePath(TreeNode root, int targetSum) {        
        if(root == null)
            return;
        
        list.add(root.val);
        
        
        calculatePath(root.left, targetSum);
        calculatePath(root.right, targetSum);
        
        int temp = 0;
        // iterate through the list
        for(int i=list.size()-1;i>=0;i--) {
            temp += list.get(i);
            if(temp == targetSum)
                count++;
        }
        
        // remove the last element 
        list.remove(list.size()-1);
    }
}