class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder result = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        while(i >=0 || j >=0) {
            int idigit = i >=0 ? num1.charAt(i--) - '0':0;
            int jdigit = j>=0 ? num2.charAt(j--) - '0':0;
            int sum = (carry) + (idigit+jdigit);
            carry = sum/10;
            result.append(sum%10);
            
        }
        
        if(carry > 0) {
            result.append(carry);
        }
        
        return result.reverse().toString();
        
    }
}