class Solution {
    public int[][] merge(int[][] intervals) {
        
        // result 
        List<int[]> result = new ArrayList<int[]>();
        
        // sort the intervals
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        // create a stack 
        Stack<int[]> stack = new Stack<>();
        
        
        // loop through the intervals
        for(int i=0;i<intervals.length;i++) {
            if(!stack.isEmpty()) {
                int[] prevElement = stack.peek();
                if(prevElement[1] >= intervals[i][0]) {
                    stack.pop();                    
                    stack.add(new int[]{prevElement[0], (prevElement[1] > intervals[i][1]) ? prevElement[1] : intervals[i][1]});
                } else {
                    stack.add(intervals[i]);
                }
            } else {
                // stack is empty
                stack.add(intervals[i]);
            }
        }
        
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
        
        return result.toArray(new int[result.size()][2]);
        
        
    }
}