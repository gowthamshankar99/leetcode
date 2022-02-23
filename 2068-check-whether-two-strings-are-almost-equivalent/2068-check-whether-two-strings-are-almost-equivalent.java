class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        // create hashmap 
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        // go over word1
        for(int i=0;i<word1.length();i++) {
            // increment hashmap
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0)+1);
        }
        
        // go over word2
        for(int i=0;i<word2.length();i++) {
            // decrement hashmap
            map.put(word2.charAt(i), map.getOrDefault(word2.charAt(i), 0)-1);
        }
        
        // iterate through the hashmap values
        for(Integer val : map.values()) {
            if(Math.abs(val) > 3)  {
                return false;
            }
        }
        
        return true;
    }
}