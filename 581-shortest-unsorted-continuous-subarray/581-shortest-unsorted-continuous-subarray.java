class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start;
        int index = 0;
        int end;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != snums[i]) {
                 start = nums[i];
                 index = i;
                 break;
            }
        }
        
        // end index 
        int endIndex = 0;
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i] != snums[i]) {
                endIndex = i;
                break;
            }
        }
        
        if(index == 0 && endIndex == 0)
            return 0;
        
        return (endIndex-index)+1;
    }
}



//[2,6,4,8,10,9,15]
//[2,4,6,8,9,10,15]

//1,5


//[2,6,4,8,1,9,15]
//[1,2,4,6,8,9,15]