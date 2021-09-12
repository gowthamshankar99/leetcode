class Solution {
    public int singleNumber(int[] nums) {
        // using map 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // loop through the hashmap 
        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        
        return -1;
    }
}