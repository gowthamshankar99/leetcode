class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }
        
       for(int i=0;i<nums.length;i++) {
           int remainingValue = target - nums[i];
           if(map.containsKey(remainingValue) && map.get(remainingValue) != i) {
               return new int[] {i, map.get(remainingValue) };
           }   
       }
    return null;
    }
}