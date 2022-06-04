/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        LinkedList<List<Integer>> output = new LinkedList<>();
        Queue<Node> queue = new LinkedList<Node>();
        
        if(root == null)
            return output;
        
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size(); 
            List<Integer> level = new LinkedList<>();
            
            for(int i=0;i<size;i++) {
                Node node = queue.poll();
                level.add(node.val);
                
                queue.addAll(node.children);
            }
            output.add(level);
        }
        
        return output;
    }
}


