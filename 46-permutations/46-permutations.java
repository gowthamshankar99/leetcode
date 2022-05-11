class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> currentList = new ArrayList<Integer>();
        
        backtrack2(nums, result, "", currentList);
        
        return result;
        
    }
    
    public void backtrack2(int[] nums, List<List<Integer>> result, String currentString, List<Integer> currentList) {
        
        if(currentList.size() == nums.length) {
            // loop through the currentString 
            result.add(new ArrayList<>(currentList));
            return;
        }
        
        for(int i=0;i<nums.length;i++) {
            String c= Integer.toString(nums[i]);  
            if(!currentList.contains(nums[i])) {            
                currentList.add(nums[i]);
                backtrack2(nums, result, currentString + nums[i], currentList);
                currentList.remove(currentList.size()-1);
            }
        }
    }
    
    
    public void backtrack(int[] nums, List<List<Integer>> result, String currentString, List<Integer> currentList) {
        
        //if(currentString.length() == nums.length) {
        if(currentString.length() == nums.length) {
            System.out.println(currentString);
            // loop through the currentString 
            for(int i=0;i<currentString.length();i++) {
                currentList.add(Character.getNumericValue(currentString.charAt(i)));
            }
            result.add(currentList);
            
            return;
        }
        
        for(int i=0;i<nums.length;i++) {
            String c= Integer.toString(nums[i]);  
            if(!currentString.contains(c)) {            
                currentList = new ArrayList<Integer>();
                backtrack(nums, result, currentString + nums[i], currentList);
            }
        }
    }
}