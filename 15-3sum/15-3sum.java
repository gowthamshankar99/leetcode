class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
          // Result
          List<List<Integer>> result = new ArrayList<List<Integer>>();
          List<Integer> subList = null;
          Arrays.sort(nums);
          for(int i=0;i<nums.length-2;i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
            int start = i+1;
            int end = nums.length-1;

            while(start < end) {
                if(nums[start] + nums[end] + nums[i] > 0) {
                    end--;
                } else if(nums[start] + nums[end] + nums[i] < 0) {
                    start++;
                } else {
                    subList = new ArrayList<Integer>();
                    subList.add(nums[i]);
                    subList.add(nums[start]);
                    subList.add(nums[end]);
                    result.add(subList);
                    
                    while(start < end && nums[start] == nums[start+1]) 
                        start++;
                    while(start < end && nums[end] == nums[end-1])
                        end--;
                    start++;
                    end--;
                }
            }
        
        }
       }
        
        return result;
    }
}