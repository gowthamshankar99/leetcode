class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        // create a stack
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        
        // loop through first String 
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != '#') {
                stack.add(s.charAt(i)); 
            } else {
                if(!stack.empty())
                    stack.pop();
            }
        }
    
         // loop through second String 
        for(int i=0;i<t.length();i++) {
            if(t.charAt(i) != '#') {
                stack2.add(t.charAt(i)); 
            } else {
                if(!stack2.empty())
                    stack2.pop();
            }
        }
        
        
        // return true if the stack is empty - else return false
        return stack.equals(stack2);
        
    }
}