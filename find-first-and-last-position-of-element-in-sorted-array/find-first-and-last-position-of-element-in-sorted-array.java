class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // Base case 
        if(nums.length == 0) {
            return new int[]{-1,-1};
        }
        
        if(nums.length == 1) {
            if(nums[0] == target) {
                return new int[]{0,0};
            } else {
                return new int[]{-1,-1};
            }
        }
        
        if(nums.length == 2) {
            if(nums[0] != target && nums[1] != target) {
                return new int[]{-1,-1};
            } else if(nums[0] == target && nums[1] == target) {
                return new int[]{0,1};
            }
            else if(nums[0] == target){
                return new int[]{0,0};
            } else if(nums[1] == target) {
                return new int[]{1,1};
            }
        }
        
        int midPoint = nums.length/2;
        
        int start = 0;
        int end = nums.length-1;
        
        int index = binarySearch(nums, target, start, end, 0);
        
        boolean leftFlag,rightFlag = false;
        
        int i = index;
        int j = index;
        
        int leftCounter = index;
        int rightCounter = index;
        
        int counter = index;
        if(i == 0) {
            leftCounter = 0;
        }
        // left loop
        while(i > 0) {

            if(nums[i-1] == target) {
                leftCounter = i-1;
                i--;
            }
            else {
                break;
            }
        }
        
        if(j == nums.length-1) {
            rightCounter = j;
        }
        
        // right loop 
        while(j < nums.length-1) {
            if(nums[j+1] == target) {
                rightCounter = j+1;
                j++;
            } else {
                break;
            }
        }
    
        
        return new int[]{leftCounter,rightCounter};
    }
    
    public int binarySearch(int[] nums, int target, int start, int end, int prevMidpoint) {
        
        int midPoint = (start+end)/2;
        if(start == end) {
            return -1;
        }
        
        if(midPoint == 0 && target != nums[midPoint]) {
            return -1;
        }
        
        if(prevMidpoint == midPoint && nums[midPoint] != target) {
            if(nums[midPoint+1] == target)
                return midPoint+1;
            else
                return -1;
        }
        
        if(target == nums[midPoint]) {
            return midPoint;
        }

        
        if(nums[midPoint] < target) {
             prevMidpoint = midPoint;
             start = midPoint;
             return binarySearch(nums, target, start, end, prevMidpoint);
        }
        else {
            prevMidpoint = midPoint;
            end = midPoint;
            return binarySearch(nums, target, start, end, prevMidpoint);
        }
    }
}