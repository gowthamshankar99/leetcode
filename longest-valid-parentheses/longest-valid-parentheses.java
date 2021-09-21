class Solution {
    public int longestValidParentheses(String s) {
        
      int resultCount = 0;

      if(s.length() == 0) {
          return resultCount;
      }
      
      // Create stack 
      Stack<Integer> stack = new Stack<Integer>();
      stack.push(-1);
      
      // loop through the string
      for(int i=0;i<s.length();i++) {
          if(s.charAt(i) == '(') {
              stack.push(i);   // push the element
          }
          else { 
              stack.pop();
              if(stack.isEmpty()) {
                  stack.push(i);
              } else {
                  System.out.println(i-stack.peek());
                  resultCount = Math.max(resultCount, i-stack.peek());
              }
           }
      }      
    return resultCount;
    }
}