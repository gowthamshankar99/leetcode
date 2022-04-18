class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) 
            return false;
        
         // array to hold 
        int[] resultArray = new int[26];
        
        for(int i=0;i<s.length();i++) {
            resultArray[s.charAt(i) - 'a']++;
            resultArray[t.charAt(i) - 'a']--;
        }
    
        
        //loop through the array 
        for(int val : resultArray) {
            if(val !=0 )
                return false;
        }
        
        return true;
    }
}