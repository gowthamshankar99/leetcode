class Solution {
    public int maxProduct(int[] nums) {
        
        int minValue = nums[0];
        int maxValue = nums[0];
        int result = nums[0];
        int currentProduct = nums[0];
        
        for(int i=1;i<nums.length;i++) {
           
            currentProduct = currentProduct*nums[i];
            int temp_maxValue = Math.max(nums[i]*maxValue, Math.max(nums[i]*minValue, nums[i]));
            
            
            minValue = Math.min(nums[i]*maxValue, Math.min(nums[i]*minValue, nums[i]));
            
            maxValue = temp_maxValue;
            
            result = Math.max(maxValue, result);
            
        }
        
        return result;
    }
}

/*
2   3  -2  4

2   6   6  
2   2  -12  

*/