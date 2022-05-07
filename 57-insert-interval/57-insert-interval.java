class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        // ArrayList
        
        List<int[]> result = new ArrayList<int[]>();
        
        for(int[] temp : intervals) {
            result.add(temp);
        }
        
        result.add(newInterval);
        
        Collections.sort(result, (a, b) -> a[0] - b[0]);
        
        // create stack
        Stack<int[]> stack = new Stack<>();
        
        // loop through the intervals
        for(int[] interval : result) {
            if(!stack.isEmpty()) {
                int[] prevInterval = stack.peek();
                if(prevInterval[1] >= interval[0]) {
                    // pop the element off the stack 
                    stack.pop();
                    //if(interval[0] > interval[1]) 
                    stack.add(new int[]{prevInterval[0], (prevInterval[1] > interval[1]) ? prevInterval[1] : interval[1]});
                } else {
                    stack.add(interval);
                }
            }  else {
                // stack is empty
                stack.add(interval);
            }
        }
        
        result.clear();
        
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        } 
        
        Collections.reverse(result);
        

        return result.toArray(new int[result.size()][2]);
    }
}