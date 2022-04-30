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
    
    
    public List<Integer> preorderTraversal2(TreeNode root) {
        
        if(root == null)
            return resultList;   
        
        if(root != null)
            resultList.add(root.val);
        
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return resultList;
    }
    
    
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        LinkedList<Integer> output = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if(root == null)
            return output;
        
        // add the root element
        stack.add(root);
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            
            if(node.right != null) {
                stack.add(node.right);
            } 
            
            if(node.left != null) {
                stack.add(node.left);
            }
        }
        
        return output;
    }
}