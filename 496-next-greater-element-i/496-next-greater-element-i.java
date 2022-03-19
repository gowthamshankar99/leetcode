class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            
        // loop through the array 
        // if stack is empty add the element to the stack 
        // if stack is not empty - compare current element with poll element and 
        // if greater - add to stack 
        // if not - add to stack ...
        
        // once all of the loop is done -- pop all elements and map to -1 
        
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums2.length;i++) {
             if(stack.isEmpty()) {
                 stack.add(nums2[i]);
             } else {
                 // if stack is not empty 
                 if(stack.peek() < nums2[i]) {
                 while(!stack.isEmpty() && stack.peek() < nums2[i]) {
                      map.put(stack.pop(), nums2[i]);
                 } } 
                     stack.add(nums2[i]);
             }
        }
        
        // add the last element 
        stack.add(nums2[nums2.length-1]);
        
        // while stack is not empty
        while(!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        // result array 
        int[] result = new int[nums1.length];
        // loop through nums1 - push the corresponding element to array 
        for(int j=0;j<nums1.length;j++) {
            if(map.get(nums1[j]) == null) 
                result[j] = -1;
            else   
                result[j] = map.get(nums1[j]);
        }
        
        return result;
    }
}