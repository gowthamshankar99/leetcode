class Solution {
    public String minRemoveToMakeValid(String s) {
        // create stack 
        Stack<String> stack = new Stack<String>();
        // create stringBuilder 
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    stack.push(Character.toString(s.charAt(i)) + "," + i);
                } else {
                    // if the stack is not empty 
                    if(stack.peek().contains("(") && s.charAt(i) == ')') {
                        stack.pop();
                    } else {
                        stack.push(Character.toString(s.charAt(i)) + "," + i);
                    }
                } 
            }
        }
        
        // check if the stack is empty 
        while(!stack.isEmpty()) {
            sb.deleteCharAt(Integer.parseInt(stack.pop().split(",")[1]));
        }
        
        
        return sb.toString();
    }
}