class Solution {
    public int lastStoneWeight(int[] stones) {
        
        // [1,1,2,4,7,8]
        
        if(stones.length == 0)
            return 0;
        
        if(stones.length == 1)
            return stones[0];
        
        Arrays.sort(stones);
        
        Queue<Integer> queue = new PriorityQueue<Integer>((a,b) -> b-a);
        
        int pointer1 = stones.length-1;
        int pointer2 = stones.length-2;
        
        while(pointer2 >= 0) {
            if(stones[pointer1] != stones[pointer2])
                queue.add(stones[pointer1] - stones[pointer2]);
            
            pointer1 = pointer1 - 2;
            pointer2 = pointer2 - 2;
        }
        
        if(pointer1 == 0) queue.add(stones[pointer1]);
        
        while(queue.size() > 1) {
            int ele1 = queue.remove();
            int ele2 = queue.remove();
            
            if(ele1 - ele2 != 0);
                queue.add(Math.abs(ele1-ele2));
        }
        
        return (queue.size() == 0) ? 0 : queue.remove();
        
    }
}