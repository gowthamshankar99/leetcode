class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       // create a hashset of string
       HashSet<String> set = new HashSet<String>();
       for(int i=0;i<board.length;i++) {
           for(int j=0;j<board[0].length;j++) {
               if(board[i][j] != '.') {
                   if(!set.add(board[i][j] + " found in the row " + i) || !set.add(board[i][j] + " found in the column " + j) || !set.add(board[i][j] + " found in the box " + i/3 + " " + j/3))
                     return false;
                }
           }
       }
        
        return true;
    }
}