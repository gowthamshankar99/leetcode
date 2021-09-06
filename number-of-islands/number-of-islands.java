class Solution {
    public int numIslands(char[][] grid) {
        
        int totalNumberOfIslands = 0;
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == '1') {          
                    totalNumberOfIslands = totalNumberOfIslands + dfs(grid, i, j);
                }
            }
        }
        
        return totalNumberOfIslands;
    }
    
    public int dfs(char[][] grid, int i, int j) {
        
        // Base case for recursion
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')         
        {
           return 0; 
        }
        
        grid[i][j] = '0';
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        return 1;
    }
}