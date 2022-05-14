class Solution {
    public String decodeString(String s) {
        
        // create a stringbuilder result
        StringBuilder sb = new StringBuilder();
        
        // stack create
        Stack<Character> stack = new Stack<Character>();

        // loop through the string 
        for(int i=0;i<s.length();i++) {        
            // until we hit the "]" and start popping out until we hit the "["
            if(s.charAt(i) == ']') {
                char poppedVal = stack.pop();
                String temp = "";
                
                while(poppedVal != '[') {
                    temp = temp + poppedVal;
                    poppedVal = stack.pop();
                }
                
                StringBuilder k = new StringBuilder("");
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k.append(stack.pop());
                }
                k.reverse();
                // convert k to int 
                int kInt = Integer.parseInt(k.toString());
                
                for(int count=0;count<kInt;count++) {
                    for(int j=temp.length()-1;j>=0;j--) {
                        stack.add(temp.charAt(j));
                    }
                }
                
            } else {
                stack.add(s.charAt(i));
            }
        
        }
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }


        // return ( convert stringbuilder to string)
        return sb.reverse().toString();
        
    }
}