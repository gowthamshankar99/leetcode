class Solution {
    public int[][] kClosest(int[][] points, int k) {
         
        
        // create priorityQueue 
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        
        for(int i=0;i<points.length;i++) {
              queue.add(new int[]{i, ((points[i][0]*points[i][0]) + (points[i][1]*points[i][1]))});
              if(queue.size() > k) {
                  queue.remove();
              }
        }
        
        // create result array 
        int[][] result = new int[k][2];
        int counter = 0;
        
        for(int[] it :  queue) {
            //System.out.println(queue.poll());    
            result[counter++] = points[it[0]];
        }
        
        return result;
    }
}