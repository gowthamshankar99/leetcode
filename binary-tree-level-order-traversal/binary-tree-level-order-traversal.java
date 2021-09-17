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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        // create the result array 
        List<List<Integer>> list = new ArrayList<>();
        // error chck 
        if(root == null) {
            return list;
        }
        
        // Create a queue
        Queue<TreeNode> queue = new LinkedList<>();
        // get the current level into the queue 
        queue.add(root);
        while(!queue.isEmpty()) {
            // get the size of the queue 
            int size = queue.size();
            List<Integer> currentList = new ArrayList<>();
            
            for(int i=0;i<size;i++) {
                TreeNode currentNode = queue.remove();
                currentList.add(currentNode.val);
                
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                } 
                
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                
            }
            
            list.add(currentList);
        }
        return list;
    }
}