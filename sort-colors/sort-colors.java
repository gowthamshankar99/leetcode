class Solution {
    public void sortColors(int[] nums) {
        
    for(int i=1;i<nums.length;i++) {
        int currentNumber = nums[i], j = i;
        while(j > 0 && currentNumber < nums[j-1]) {
            nums[j] = nums[j-1];
            j--;
        }
        nums[j] = currentNumber;
     }

    }
}