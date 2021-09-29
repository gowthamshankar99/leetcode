class Solution {
    public int maximumDifference(int[] nums) {
        
        int maxValue = -1;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
            if(nums[j] > nums[i])
                maxValue = Math.max(maxValue, nums[j]-nums[i]);
            }
        }
        return maxValue;
    }
}