class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // loop through the outer array 
        for(int i=0;i<matrix.length;i++) {
        // in the inner array check if the target is less than the last element - if so - it is in that 
        // occurance     
            if(matrix[i][matrix[i].length-1] == target) {
                return true;
            } else if(matrix[i][matrix[i].length-1] > target) {
                 // its in that occurance
                return binarySearch(matrix[i], target);
                
            } else  {
                // do nothing - move to next array in the outer array 
            }
        }
        return false;
    }
    
    public boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        
        while(start <= end) {
            int midPoint = (start + end)/2;
            if(nums[midPoint] == target) 
                return true;
            else if(nums[midPoint] > target) {
                end = midPoint - 1;
            } else {
                start = midPoint + 1;
            }
        }
        
        return false;
    }
}