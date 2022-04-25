class MinStack {
    
    Stack<Integer> resultStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {}
    
    public void push(int val) {
        // check the current minValue - and update if neccessary
        if(minStack.isEmpty() || minStack.peek() >= val) {
            // update the minValue
            minStack.add(val); 
        }
       // push the value to the result stack 
        resultStack.add(val);
    }
    
    public void pop() {
        // check the current minValue and if the value being removed are the same - if so - remove the value from the stack too 
        if(minStack.peek().equals(resultStack.peek())) {
            minStack.pop();
            
        } 
        resultStack.pop();        
    }
    
    public int top() {
        return resultStack.peek();
    }
    
    public int getMin() {
        // get sizes
        //System.out.println(minStack.size());
        //System.out.println(resultStack.size());
        return minStack.peek();
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