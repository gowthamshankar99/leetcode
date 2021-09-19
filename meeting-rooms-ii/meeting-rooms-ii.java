class Solution {
    public int minMeetingRooms(int[][] intervals) {
       if(intervals == null || intervals.length == 0) {
           return 0;
       }
        
      Arrays.sort(intervals, new Comparator<int[]>() {
          public int compare(int[] a, int[] b) {
              return a[0] - b[0];
          }
      });
        
     // create a priority queue
     PriorityQueue<int[]> pb = new PriorityQueue<int[]>(new Comparator<int[]>() {
         public int compare(int[] a, int[] b) {
             return a[1] - b[1];
         }
     });
        
        pb.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++) {
            int[] previous = pb.remove();
            int[] current = intervals[i];
            if(current[0] >= previous[1]) {
                previous[1] = current[1];
            } else {
                pb.add(current);
            }
            
            pb.add(previous);
        }
        
        
     return pb.size();
    }
}