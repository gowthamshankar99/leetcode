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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        // base case 
        if(root.val == x || root.val == y) {
            return false;
        }
        // create a queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        queue.add(root);
        
        List<List<Integer>> list = new ArrayList<>();
        int height = 0;
        
        while(!queue.isEmpty()) {
            height++;
            int size = queue.size();
            List<Integer> temp = null; // = new ArrayList<Integer>();
            for(int i=0;i<size;i++) {
                // create innerList
                 temp = new ArrayList<Integer>();
                 TreeNode node = queue.remove();
                 temp.add(node.val);
                 
                 
                 //System.out.println(height + "->" + node.val);
                 if(node.left != null) {
                     map.put(node.left.val, new ArrayList<Integer>(Arrays.asList(height, node.val)));
                     queue.add(node.left);
                 }               
                 if(node.right != null) {
                     map.put(node.right.val, new ArrayList<Integer>(Arrays.asList(height, node.val)));
                     queue.add(node.right);
                 }
            }
            
            list.add(temp);
        }
        
        // get x's array and y's array 
        
        List<Integer> xList = map.get(x);
        List<Integer> yList = map.get(y);
        
        if(xList.get(0) == yList.get(0) && xList.get(1) != yList.get(1))
            return true;
        
        
        return false;
    }
}

/*

1. do a breath first search 
   store values like this 
   [1], [2,3], [4]
2. 

*/

/*

  

*/