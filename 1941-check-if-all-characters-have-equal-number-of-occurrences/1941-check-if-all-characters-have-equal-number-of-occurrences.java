class Solution {
    public boolean areOccurrencesEqual(String s) {
        // create a map 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        int valueChecker = map.get(s.charAt(0));
        for(int val : map.values()) {
            if(valueChecker != val) {
                return false;
            } else {
                valueChecker = val;
            }
        }
        
        return true;
    }
}