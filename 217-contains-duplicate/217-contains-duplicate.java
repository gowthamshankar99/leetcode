class Solution {
    public boolean containsDuplicate(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) 
                return true;
        }
        return false;
    }
}