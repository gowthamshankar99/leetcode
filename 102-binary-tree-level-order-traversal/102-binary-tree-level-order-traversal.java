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
        
        // result list 
        List<List<Integer>> resultList = new ArrayList<>();
        
        if(root == null) 
            return resultList;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode node = queue.poll();
//                System.out.println(node.val);
                tempList.add(node.val);
                if(node.left != null) 
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            
            }
            
            resultList.add(tempList);
        }
        
        return resultList;
        
    }
}