class Solution {
    public int search(int[] nums, int target) {
        // get the mid element 
        
        if(nums.length == 0)
            return -1;
        
        if(nums.length == 1) {
            if(nums[0] != target)
                return -1;
            else
                return 0;
        }
            
            
        
        return binarySearch(nums, 0, nums.length-1, target);
        
    }
    
    public int binarySearch(int[] nums, int left, int right, int target) {
        int mid = left + ((right - left) / 2);
        
        if(left > right)
        {
            return -1;
        }
        
        if(target == nums[mid]) {
            return mid;
        }
        
        if(target > nums[mid]) {
            return binarySearch(nums, mid+1, right, target);
        }
        
        if(target < mid) {
            return binarySearch(nums, left, mid, target);
        }
        
        return -1;
    }
}