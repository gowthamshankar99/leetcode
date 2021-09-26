class MaxStack {

    
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    /** initialize your data structure here. */
    public MaxStack() {
        stack = new Stack<Integer>(); 
        maxStack = new Stack<Integer>(); 
    }
    
    public void push(int x) {
        if(maxStack.isEmpty()) {
            maxStack.push(x);
        } else {
            maxStack.push(Math.max(maxStack.peek(), x));
        }
        stack.push(x);
    }
    
    public int pop() {
        maxStack.pop();
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int peekMax() {
        return maxStack.peek();
    }
    
    public int popMax() {
        // get max from maxStack 
        int max = peekMax();
        Stack<Integer> bufferStack = new Stack<Integer>();
        while(top() != max) bufferStack.push(pop());
        pop();
        // push elements from Buffer into the real stack 
        while(!bufferStack.isEmpty()) {
            push(bufferStack.pop());
        }
        
        return max;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */