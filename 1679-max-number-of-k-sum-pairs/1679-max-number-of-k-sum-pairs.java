class Solution {
    public int maxOperations(int[] nums, int k) {
        // result integer
        int result = 0;
        // sort the array 
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        // use the 2 pointer technique with start and end 
        while(start < end) {
            // once you find the result ... move the pointers and increment counter 
            if(nums[start] + nums[end] == k) {
                start++;
                end--;
                result++;
            } else if(nums[start] + nums[end] > k) {
                end--;
            } else {
               start++;
            }
        }
        return result;
    }
}