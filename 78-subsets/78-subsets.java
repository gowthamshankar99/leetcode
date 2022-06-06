class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSet = new ArrayList<>();
        String currentString = "";
        backtrack(result, nums, 0, currentSet, currentString);
        
        
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, int[] nums, int index, List<Integer> currentSet, String currentString) {
        
        result.add(new ArrayList<>(currentSet));
        
        for(int i=index;i<nums.length;i++) {
            currentSet.add(nums[i]);
            backtrack(result, nums, i+1, currentSet, currentString);
            currentSet.remove(currentSet.size()-1);
        }
    }
}