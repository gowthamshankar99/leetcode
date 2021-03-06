class Solution {
    public int evalRPN(String[] tokens) {
    
        
        // initialize the stack 
        Stack<Integer> stack = new Stack<>();
        
        // loop through the characters 
        for(int i=0;i<tokens.length;i++) {
            // check if the digit is a special character ?
            if(tokens[i].contentEquals("+") || tokens[i].contentEquals("-") || tokens[i].contentEquals("/") || tokens[i].contentEquals("*")) {
                int firstElement = stack.pop();
                int secondElement = stack.pop();
                
                if(tokens[i].contentEquals("+")) 
                    stack.add(firstElement+secondElement);
                else if(tokens[i].contentEquals("-"))
                    stack.add(secondElement-firstElement);
                else if(tokens[i].contentEquals("*"))
                    stack.add(firstElement*secondElement);
                else 
                    stack.add(secondElement/firstElement);
            } else {
                stack.add(Integer.parseInt(tokens[i]));
            }
        }
        
        
        return stack.pop();
        // if it is - pop 2 times and perform the operations and push the element 
        
    }
}