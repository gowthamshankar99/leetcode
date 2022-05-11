class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<String>();
        if(digits.contentEquals("")) {
            return result;
        }
        
        
        String[] mappings = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        
        backtrack(result, digits, mappings, "", 0);        
        return result;
        
    }
    
    public void backtrack(List<String> result, String digits, String[] mappings, String currentString, int index) {
        // base case 
        
        if(index == digits.length()) {
            result.add(currentString);
            return;
        }
        
        String letters = mappings[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++) {
            backtrack(result, digits, mappings, currentString + letters.charAt(i), index+1);
        }
        
        
    }
}