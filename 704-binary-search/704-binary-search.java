class Solution {
    public int search(int[] nums, int target) {
        
    
        return binarySearchNonRecursive(nums,0, nums.length-1, target);
        
    }
    
    public int binarySearch(int[] nums, int start, int end, int target) {
        int midPoint = (start + (end))/2;
        
        if(nums[midPoint] > target) {
             end = midPoint-1;
             binarySearch(nums, start, end, target);
        } else if(nums[midPoint] < target) {
             start = midPoint+1;
             binarySearch(nums, start, end, target);
        } else {
            return midPoint;
        }
        
        return -1;
    }
    
    
    public int binarySearchNonRecursive(int[] nums, int start, int end, int target) {
        while(start <= end) {
            int midPoint = (start + (end))/2;
             if(nums[midPoint] > target) {
                 end = midPoint-1;
            } else if(nums[midPoint] < target) {
                 start = midPoint+1;
            } else {
                return midPoint;
            }
        }
        return -1;
    }
}