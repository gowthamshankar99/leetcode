class Solution {
    public int lastStoneWeight(int[] stones) {
        
        // [1,1,2,4,7,8]
        
        if(stones.length == 0)
            return 0;
        
        if(stones.length == 1)
            return stones[0];
        
        Queue<Integer> queue = new PriorityQueue<Integer>((a,b) -> b-a);

        for(int i=0;i<stones.length;i++) {
            queue.add(stones[i]);
        }
        
        while(queue.size() > 1) {
            int ele1 = queue.remove();
            int ele2 = queue.remove();
            
            if(ele1 - ele2 != 0);
                queue.add(Math.abs(ele1-ele2));
        }
        
        return (queue.size() == 0) ? 0 : queue.remove();
        
    }
}