class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // sort input
        Arrays.sort(nums);
        // result
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return list;
        
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                int low = j+1;
                int high = nums.length-1;
                
                while(low < high) {
                    if(nums[i] + nums[j] + nums[low] + nums[high] == target) {
                         
                         List<Integer> innerList = new ArrayList<Integer>();
                         innerList.add(nums[i]);
                         innerList.add(nums[j]);
                         innerList.add(nums[low]);
                         innerList.add(nums[high]);
                         if(!list.contains(innerList)) {
                              list.add(innerList);
                         }

                         high--;
                         low++;
                    }
                    else if(nums[i] + nums[j] + nums[low] + nums[high] > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        
        
        return list;
    }
}