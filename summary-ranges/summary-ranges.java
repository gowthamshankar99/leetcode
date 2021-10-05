class Solution {
    public List<String> summaryRanges(int[] nums) {
        // result array 
        List<String> list = new ArrayList<String>();
        
        if(nums.length == 0)
            return list;
        
        if(nums.length == 1) {
            list.add(Integer.toString(nums[0]));
            return list;
        }

        int size = nums.length+nums[0];
        int start = nums[0];
        int lastCounter = 0;
        
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]+1 != nums[i+1]) {
                
                if(i==0) {
                     list.add(Integer.toString(nums[0]));
                } else if(start == nums[i]) {
                    list.add(Integer.toString(start));
                }
                else 
                    list.add(Integer.toString(start) + "->" + Integer.toString(nums[i]));   
                // update start element
                start = nums[i+1]; 
                lastCounter = nums[i+1];
            }
        }
        
        // edge case takecare of last element
        //if(!list.isEmpty() &&  !list.get(list.size()-1).contains(Integer.toString(nums[nums.length-1]))) {
        if(!list.isEmpty()) {
            if(start == nums[nums.length-1])
                list.add(Integer.toString(nums[nums.length-1]));
            else
                list.add(Integer.toString(start) + "->" + Integer.toString(nums[nums.length-1]));
        }
        
                
        // edge case
        if(list.isEmpty())
            list.add(Integer.toString(start) + "->" + Integer.toString(nums[nums.length-1]));
        
        return list;
}
}