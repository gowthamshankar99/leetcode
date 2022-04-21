class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) {
            return 0;
        } 
        
        if(nums.length == 1) {
            return 1;
        }
        
        Arrays.sort(nums);
        int result = 1;
        int maxResult = 1;
        
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] != nums[i+1]) { 
            int currentELement = nums[i];
            int nextElement = nums[i+1];
            if(currentELement + 1 == nextElement) {
                result = result + 1;
                
            } else {                
                maxResult = Math.max(maxResult, result);
                result = 1;
            }
          }
        }
     return Math.max(maxResult, result);   
    }
}