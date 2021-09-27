class MyStack {
    
    int top; 

    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        // get the current size
        int size = queue.size();
        // for every push reverse the queue
        top = x;
        queue.add(x);
        for(int i=0;i<size;i++) {
            queue.add(queue.remove());
        }
    }
    
    public int pop() {
        
        return queue.remove();
    }
    
    public int top() {
        
        return queue.peek();
    }
    
    public boolean empty() {
        
        return (queue.size() == 0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */