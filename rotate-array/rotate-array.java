class Solution {
    public void rotate(int[] nums, int k) {
        
        // create queue
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i=nums.length-1;i>=0;i--) {
            // add all elements to the queue
            queue.add(nums[i]);
        }
        
        for(int i=0;i<k;i++) {
            // remove from queue
            queue.add(queue.remove());
        }
        
        int counter = nums.length-1;
        for(int element : queue) {
            nums[counter] = element;
            counter--;
        }
        
    
    }
}