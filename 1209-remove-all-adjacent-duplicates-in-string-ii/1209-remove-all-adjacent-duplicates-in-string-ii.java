class Solution {
    public String removeDuplicates(String s, int k) {
        
        // create a stack to hold the results
        Stack<Integer> stack = new Stack<Integer>();
        
        // create a string builder
        StringBuilder sb = new StringBuilder(s);
        
        // first Element 
        char prev = sb.charAt(0);
        
        // loop through the string 
        for(int i=1;i<sb.length();i++) {
              if(i < 1) {
                  i = 1;
              }
            
              if(stack.isEmpty()) stack.add(1);
              if(sb.charAt(i-1) == sb.charAt(i)) {
                    stack.add(stack.pop() + 1); 
                    if(stack.peek() == k) {
                        sb.delete(i - k + 1, i + 1);
                        stack.pop();
                        i = i - k;
                    }
              } else {
                  stack.add(1);
              }
        }
        return sb.toString();
    }
}