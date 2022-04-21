class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         // sort the Array 
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length-2;i++) {
            if(i==0 || (i>0 && nums[i-1] != nums[i])) {
                 int low = i+1;
                 int high = nums.length -1;
                 int sum = 0-nums[i];
                 while(low < high) {
                     if(sum == nums[low] + nums[high]) {
                         List<Integer> innerList = new ArrayList<Integer>();
                         innerList.add(nums[i]);
                         innerList.add(nums[low]);
                         innerList.add(nums[high]);
                         list.add(innerList);
                         while(low < high && nums[low] == nums[low+1]) low++;
                         while(low < high && nums[high] == nums[high-1]) high--;
                         low++;
                         high--;
                     } else if(nums[low] + nums[high] > sum) {
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