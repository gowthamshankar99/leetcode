class Solution {
    public boolean isValid(String s) {
        
        // create map of the elements
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        
        // create a stack 
        Stack<Character> stack = new Stack<>();
        
        // loop through the string 
        for(int i=0;i<s.length();i++) {
        
            // if the stack is empty - add the element to stack 
            if(stack.isEmpty()) { 
                stack.add(s.charAt(i))  ;  
            } else {
                // if stack is not empty - check if the popped element is its contemprary        
                if(map.containsKey(s.charAt(i))) {
                    if(stack.peek() == map.get(s.charAt(i))) {
                        stack.pop();
                    } else {
                        stack.add(s.charAt(i));
                    }
                } else {
                    stack.add(s.charAt(i));
                }
            }
    }
        
                    
        if(stack.isEmpty()) return true;
            else return false;
}
}