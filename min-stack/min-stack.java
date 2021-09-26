class MinStack {
    
    Stack<Integer[]> stack;

    public MinStack() {
        stack = new Stack<Integer[]>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new Integer[]{val,val}); 
            return;
        }
        // if the stack is not empty
        // get the latest element from the stack 
        int currentMinValue = stack.peek()[1];
        stack.add(new Integer[]{val, Math.min(val, currentMinValue)});
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */