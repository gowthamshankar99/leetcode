class Solution {
    public int[] runningSum(int[] nums) {
        
        
        int currentRunningSum = 0;
        for(int i=0;i<nums.length;i++) {
            currentRunningSum = currentRunningSum + nums[i];
            nums[i] = currentRunningSum;
        }
        
        return nums;
    }
}