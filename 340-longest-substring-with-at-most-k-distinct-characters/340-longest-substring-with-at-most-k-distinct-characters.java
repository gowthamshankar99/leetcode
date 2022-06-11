class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // create hashmap 
        HashMap<Character, Integer> map = new HashMap<>();
        // result element 
        int result = 0;
        int start = 0;
        
        // loop through the string 
        for(int i=0;i<s.length();i++) {
            // add the string to a hashmap 
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i) ,map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
            
            // get all keys from hashmap 
            int len = map.keySet().toArray().length;
            
            if(len <= k) {
                result = Math.max(result, i-start+1);
            } else {
                map.put(s.charAt(start), map.get(s.charAt(start))-1);
                if(map.get(s.charAt(start)) == 0)
                    map.remove(s.charAt(start));
                start++;
            }
        }
        
        
        return result;
        
        
        
    }
}