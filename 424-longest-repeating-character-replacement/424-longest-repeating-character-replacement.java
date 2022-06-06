class Solution {
    public int characterReplacement(String s, int k) {
        
        int start = 0;
        int end = 0;
        
        //result integer 
        int result = 0;
        
        // hashmap to store the 
        HashMap<Character, Integer> map = new HashMap<>();

        // loop through the string array 
        for(int i=0;i<s.length();i++) {
            end++;
            // add the element to the hashmap 
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1); 
            } else {
                map.put(s.charAt(i), 1);
            }
            
            // get the max value from the map 
            int maxValueInMap=(Collections.max(map.values()));     
            
            // if the length of the string (-) length of most character <= k 
            if((end-start)-maxValueInMap <= k) {
                  result = Math.max(result, (end-start));
            } else {
                // decrement value 
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
        }
        return result;
        
    }
}