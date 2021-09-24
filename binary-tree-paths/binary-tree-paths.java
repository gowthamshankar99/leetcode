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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resultList = new ArrayList<String>();
        if(root == null) {
              return resultList;
        }
    
        traverseTree(root, "", resultList);
        
        return resultList;
    }
    
    public void traverseTree(TreeNode root, String path, List<String> result) {
        System.out.println(root.val);
        path += root.val + "->";
        
        if(root.left == null && root.right == null) {
            System.out.println("---End of one loop---");
            result.add(path.substring(0,path.length()-2));
            return;
        }
        if(root.left != null)
            traverseTree(root.left, path, result);
        
        if(root.right != null)
            traverseTree(root.right, path, result);
        
        
        
    }
}