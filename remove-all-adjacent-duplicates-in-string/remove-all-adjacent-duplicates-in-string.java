class Solution {
    public String removeDuplicates(String s) {
        
        // create stack result
        Stack<Character> stack = new Stack<Character>();
        
        // result Array
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
            if(!stack.empty()) {
                if(stack.peek() == s.charAt(i)) {
                     stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                    stack.push(s.charAt(i));
            }
        }
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
        
    }
}

