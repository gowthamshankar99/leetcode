class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
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
        
        if(index == 0 && endIndex == 0)
            return 0;
        
        return (endIndex-index)+1;
    }
}