class Solution {
    public boolean isAnagram(String s, String t) {
         // array to hold 
        int[] resultArray = new int[26];
        
        for(int i=0;i<s.length();i++) {
            resultArray[s.charAt(i) - 'a']++;
        }
        
        for(int j=0;j<t.length();j++) {
            resultArray[t.charAt(j) - 'a']--;
        }
        
        //loop through the array 
        for(int val : resultArray) {
            if(val !=0 )
                return false;
        }
        
        return true;
    }
}