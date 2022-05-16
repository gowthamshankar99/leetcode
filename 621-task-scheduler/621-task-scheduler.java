class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        Queue<Integer> queue = new PriorityQueue<Integer>((a,b) -> b-a);
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<tasks.length;i++) {
            if(map.containsKey(tasks[i])) {
                map.put(tasks[i], map.get(tasks[i]) + 1);
            } else {
                map.put(tasks[i], 1);
            }
        }
        
        queue.addAll(map.values());
        int count = 0;
        while(!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<n+1;i++) {
                if(!queue.isEmpty()) {
                    temp.add(queue.remove());  
                }
                
            }
            
            for(int t : temp) {
                if(--t > 0) {
                    queue.add(t);
                }
            }
            count += queue.isEmpty() ? temp.size() : n + 1;
        }
        
        
        return count;
        
    }

}