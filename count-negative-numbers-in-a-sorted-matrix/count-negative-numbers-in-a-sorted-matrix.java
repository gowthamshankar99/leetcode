class Solution {
    public int countNegatives(int[][] grid) {
         int jCounter = 0;
         int result = 0;
         for(int i=grid.length-1;i>=0;i--) {
             for(int j=jCounter;j<grid[0].length;j++) {
                 if(Math.signum(grid[i][j]) == -1) {
                     result = result + (grid[0].length-j);
                     j = jCounter;
                     break;
                 }
             }
         }
        
        return result;
    }
    
    
}

/*
[[4,3,2,-1],
[3,2,1,-1],
[1,1,-1,-2],
[-1,-1,-2,-3]]
*/

