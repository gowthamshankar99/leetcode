class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] result = new int[nums.length];
        int currentRunningSum = 0;
        for(int i=0;i<nums.length;i++) {
            currentRunningSum = currentRunningSum + nums[i];
            result[i] = currentRunningSum;
        }
        
        return result;
    }
}