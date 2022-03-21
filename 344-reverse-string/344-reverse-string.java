class Solution {
    public void reverseString(char[] s) {
        
        String temp = "";
        // reverse a string 
        for(int i=0;i<s.length;i++) {
            temp = s[i] + temp; 
        }
        
        for(int j=0;j<temp.length();j++) {
            s[j] = temp.charAt(j);
        }
        
    }
}