class Solution {
    public boolean checkValid(int[][] matrix) {
        
        Set<String> rows = new HashSet<String>();
        Set<String> columns = new HashSet<String>();
        
        
        
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(!rows.add(matrix[i][j] + "in row " + i) || !columns.add(matrix[i][j] + "in column " + j))
                    return false;
            }
        }
        
        return true;
        
        
    }
}