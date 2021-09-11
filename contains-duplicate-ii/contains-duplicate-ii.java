class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // create hashset
        Set<Integer> set = new HashSet<Integer>();
        
        // loop through the array of elemenet 
        for(int i=0;i<nums.length;i++) {
          if(set.contains(nums[i])) return true;
          set.add(nums[i]);
          if(set.size() > k) {
              set.remove(nums[i-k]);
          }
        }       
        return false;
    }
}