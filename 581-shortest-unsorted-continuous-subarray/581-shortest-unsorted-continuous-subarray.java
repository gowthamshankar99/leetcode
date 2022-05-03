class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        
        if(Arrays.equals(nums, snums)) {
            return 0;
        }
        
        int index = 0;
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != snums[i]) {
                 index = i;
                 break;
            }
        }
        
        // end index 
        int endIndex = 0;
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i] != snums[i]) {
                endIndex = i;
                break;
            }
        }
        return (endIndex-index)+1;
    }
}