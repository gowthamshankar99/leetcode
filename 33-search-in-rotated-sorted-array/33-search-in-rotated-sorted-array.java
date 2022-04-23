class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 1) {
            if(nums[0] == target)
                return 0;
            else
                return -1;
        } 
        
        int left = 0;
        int right = nums.length-1;
        
        while(left <= right) {
            int mid = (left + right)/2;
            
            if(target == nums[mid]) 
                return mid;
            
            
            if(nums[left] <= nums[mid]) {
                if(nums[left] > target || target > nums[mid]) {
                    // target is on the left side
                    left = mid + 1;
                } else {
                    // target is on the right side
                    right = mid - 1;
                }    
            } 
            else {
                // right portion
                if(nums[right] < target || target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        
        return -1;
        
    }
    
    
    public int naiveSearch(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        
        return -1;
    }
}