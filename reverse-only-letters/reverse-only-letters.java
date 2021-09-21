class Solution {
    public String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();
        // loop  
        int start = 0;
        int endIndex = charArray.length-1;
        int test = charArray.length/2;
       // for(int i=0;i<charArray.length/2;i++)  {
        while(start < endIndex) {
            if(!Character.isAlphabetic(charArray[start]) || !Character.isAlphabetic(charArray[endIndex])) {
                  if(!Character.isAlphabetic(charArray[start]))
                      start++;
                  else
                      endIndex--;
            } else {
                // both are alphabets
                char temp = charArray[start];
                charArray[start] = charArray[endIndex];
                charArray[endIndex] = temp;
                start++;
                endIndex--;
                
            }
        }
        
        return String.valueOf(charArray);
    }
}