class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        
        while(start < end) {
            int startnum = nums[start];
            int endnum = nums[end];
            if(startnum%2 == 0 && endnum%2 == 0) {
                start++;
            } else if(startnum%2 != 0 && endnum%2 != 0) {
                end--;
            } else if(startnum%2 == 0 && endnum%2 != 0) {
                start++; end--;
            } else if(startnum%2 != 0 && endnum%2 == 0) {
                int temp = startnum;
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;
            }
        }
        
        return nums;
        
    }
}