class Solution {
    public boolean canJump(int[] nums) {
        
        int lastValue = nums.length-1;
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i]+i>=lastValue) {
                lastValue = i;
            }
        }
        
        if(lastValue == 0 ) {
            return true;
        } else  {
            return false;
        }
        
    }
}