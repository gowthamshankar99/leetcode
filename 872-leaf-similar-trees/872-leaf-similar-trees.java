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
    List<Integer> root1List = new ArrayList<>();
    List<Integer> root2List = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        if(root1 == null && root2 == null) 
            return true;
        
        //collectTreeNodes(root1);
        
        iterate(root1, root1List);
        iterate(root2, root2List);
        
        return root1List.equals(root2List);
        
    }
    
    public void iterate(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            System.out.println(root.val);
            list.add(root.val);
            return;
        }
        
        iterate(root.left, list);
        iterate(root.right, list);
    }
    
    
    public List<Integer> collectTreeNodes(TreeNode root) {
        List<Integer> result = null;
        // create queue 
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            result = new ArrayList<>();
            for(int i=0;i<size;i++) {
                
                TreeNode node = queue.remove();
                result.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                
                if(node.right != null) {
                    queue.add(node.right);
                }
                
            }
        }
        return result;
    }
}