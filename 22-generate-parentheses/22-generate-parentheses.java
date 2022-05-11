class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        
        
        backtrack(result, 0,0, "", n);
        return result;
        
    }
    
    public void backtrack(List<String> result, int open, int close, String currentString, int max) {
        
        // base case 
        if(currentString.length() == max*2) {
            result.add(currentString);
            return;
        }
        
        if(open < max) {
            backtrack(result, open+1, close, currentString+"(", max);
        }
        if(open > close) {
            backtrack(result, open, close+1, currentString + ")", max);
        }
        
        
    }
}