class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] alphabhets = new int[26];
        
        for(int i=0;i<s.length();i++) {
            alphabhets[s.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<t.length();i++) {
            alphabhets[t.charAt(i) - 'a']--;
        }
         
        // iterate through the array and check if there are any other than 0s
        for(int i=0;i<alphabhets.length;i++) {
            if(alphabhets[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}