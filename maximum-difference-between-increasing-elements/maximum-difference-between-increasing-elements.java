class Solution {
    public int maximumDifference(int[] nums) {
        
        int maxValue = -1;
        int minValue = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i] <= minValue) {
                minValue = nums[i];
            } else {
                int currentMax = nums[i] - minValue;
                maxValue = Math.max(maxValue, currentMax);
            }
        }
        
        return maxValue;
    }
    
        public int maximumDifference2(int[] nums) {
        
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