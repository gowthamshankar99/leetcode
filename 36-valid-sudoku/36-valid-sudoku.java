class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet<String>();
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                int value = board[i][j];
                if(board[i][j] != '.') {
                    if(!seen.add(board[i][j] + "present in row " + i) || !seen.add(board[i][j] + "present in column " + j) ||
                      !seen.add(board[i][j] + " is in box " + i/3 + " " +  j/3))
                        return false;
                        
                }
                
            }
        }
        
        return true;
    }
}