class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> testSet = new HashSet<Character>();
        int maxSize = 0;
        
        int start = 0;
        
        //loop through the string ....
        for(int i=0;i<s.length();i++) {
            if(!testSet.add(s.charAt(i))) {  // --> if false --> if the character got repeated
                int currentSetSize = testSet.size();
                // i --> s.charAt(i) is the repeated character...
                while(start <= i) {
                    testSet.remove(s.charAt(start));
                    if(s.charAt(start) == s.charAt(i)) {
                        maxSize = Math.max(maxSize, currentSetSize);
                        testSet.add(s.charAt(i));
                        start++;
                        break;
                    }
                    start++;
                }
            }
        
        }
        return (testSet.size() > maxSize) ? testSet.size() : maxSize;
        
    }
}