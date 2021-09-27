class MyQueue {

    Stack<Integer> pushStack;
    Stack<Integer> popStack;
    public MyQueue() {
        pushStack = new Stack<Integer>();
        popStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        // push elements into the push stack 
        pushStack.push(x);
    }
    
    public int pop() {
        if(popStack.isEmpty()) {
            while(!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        } 
        return popStack.pop();

    }
    
    public int peek() {
        if(popStack.isEmpty()) {
            while(!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        } 
        return popStack.peek();
    }
    
    public boolean empty() {
        
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */