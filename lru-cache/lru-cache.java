class LRUCache {
    
    int capacity;
    HashMap<Integer, Node> map;
    Node first_node;
    Node last_node;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        first_node = new Node();
        last_node = new Node();
        first_node.next = last_node;
        last_node.prev = first_node;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        int result = -1;
        if(node != null) {
             result = node.value;
             remove(node);
             add(node);
        } 
        
        return result;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        // check if the node exists
        if(node!=null) {
            remove(node);
            node.value = value;
            add(node);
        } else {
            if(capacity == map.size()) {
                // remove from map 
                map.remove(last_node.prev.key);
                // remove from linkedlist
                remove(last_node.prev);
            } 
            // if the node doesnt exist
            Node newnode = new Node();
            newnode.key = key;
            newnode.value = value;
            //add to hashmap
            map.put(key, newnode);
            // add the linkedlist
            add(newnode);

        }
    }
    
    
    // add node to the head    
    public void add(Node node) {
        Node head_next = first_node.next;
        node.next = head_next;
        head_next.prev = node;
        first_node.next = node;
        node.prev = first_node;
    }
    
    // remove node from the tail
    public void remove(Node node) {
        Node next_node = node.next;
        Node prev_node = node.prev;
        
        prev_node.next = next_node;
        next_node.prev = prev_node;
    }
    
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }
}



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */