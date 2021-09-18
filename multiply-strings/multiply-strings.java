class Solution {
    public String multiply(String num1, String num2) {
        
        if(num1.contentEquals("0") || num2.contentEquals("0")) {
            return "0";
        }
        
        // result string 
        int[] sb = new int[num1.length() + num2.length()];

        int carry = 0;
        
        for(int i=num1.length()-1;i>=0;i--) {
            int firstChar = num1.charAt(i) - '0';
            for(int j=num2.length()-1;j>=0;j--) {
                int secondChar = num2.charAt(j) - '0';
                int sum = (firstChar * secondChar);
                
                // get the last character 
                int lastChar = (sb[i+j+1] + sum) % 10;
                carry = (sb[i+j]) + (sb[i+j+1] + sum)/10;
                sb[i+j+1] = lastChar;
                sb[i+j] = carry;
                
            }
        }
        
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<sb.length;i++) {
            sb1.append(sb[i]);
        }
        
        return sb1.toString().charAt(0) == '0' ? sb1.toString().substring(1, sb1.toString().length()) : sb1.toString();
    }
}