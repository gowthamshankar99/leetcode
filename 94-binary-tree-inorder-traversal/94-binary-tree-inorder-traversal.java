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
    public List<Integer> inorderTraversal2(TreeNode root) {
        if(root == null)
            return resultList;
        
        inorderTraversal(root.left);
        if(root != null)
            resultList.add(root.val);
        inorderTraversal(root.right);

        return resultList;
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curr = root;
        
        while(curr!= null || !stack.isEmpty()) {
            while(curr != null) {
                stack.add(curr);
                curr = curr.left;
            }
            
            curr = stack.pop();
            output.add(curr.val);
            curr = curr.right;
            
        }
        
        return output;
    }
}