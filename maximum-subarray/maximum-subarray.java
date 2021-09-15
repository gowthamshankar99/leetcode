class Solution {
    public int maxSubArray(int[] nums) {
        
        // initialize currentsubarray and maxsubarray
        int currentSubArray = nums[0];
        int maxSubArray = nums[0];
        
        for(int i=1;i<nums.length;i++) {
             currentSubArray = Math.max(currentSubArray+nums[i], nums[i]);
             maxSubArray = Math.max(currentSubArray, maxSubArray);
        }
        
        return maxSubArray;
        
    }
}