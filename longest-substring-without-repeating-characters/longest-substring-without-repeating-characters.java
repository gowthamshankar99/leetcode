class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        
        // result set 
        HashSet<Character> set  = new HashSet<Character>();
        int result = 0;
        
        int a_pointer = 0;
        int b_pointer = 0;
        
        while(b_pointer < s.length()) {
            if(!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                result = Math.max(set.size(), result);
                b_pointer++;
            } else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        
        return result;
       
        
    }
}


/*
1. create a hashset 
2. push values to the hashset - when the push is false - do math.max 
3. reset the hashset



*/