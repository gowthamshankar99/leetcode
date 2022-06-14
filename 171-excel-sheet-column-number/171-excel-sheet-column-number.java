class Solution {
    public int titleToNumber(String columnTitle) {
        
        columnTitle = columnTitle.toLowerCase();
        int result = 0;
        
        for(int i=columnTitle.length()-1;i>=0;i--) {
              result = result + ((int)Math.pow(26,columnTitle.length()-1-i) * ((columnTitle.charAt(i) - 'a')+1));
        }
        
        return result;
        
    }
}