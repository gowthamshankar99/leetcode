class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int columns = board[0].length;
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                if(board[i][j] == word.charAt(0) && sdf(board, word, 0, i, j))
                    return true;
            }
        }
        return false;
    }
    
    public boolean sdf(char[][] board, String word, int count, int i, int j) {
        if(word.length() == count) {
            return true;
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)) {
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = ' ';
        
        boolean found = sdf(board, word, count+1, i+1, j) || sdf(board, word, count+1, i, j+1) || sdf(board, word, count+1, i-1, j) || sdf(board, word, count+1, i, j-1);
        
        board[i][j] = temp;
        
        return found;
    }
}