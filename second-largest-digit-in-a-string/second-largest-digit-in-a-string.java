class Solution {
    public int secondHighest(String s) {
        
        // create min heap 
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int i=0;i<s.length();i++) {
            if(Character.isDigit(s.charAt(i))) {
                 if(!queue.contains(Character.getNumericValue(s.charAt(i))))
                    queue.add(Character.getNumericValue(s.charAt(i)));
                 if(queue.size() > 2) {
                     queue.remove();
                 }
            }
        }
        
        if(queue.isEmpty() || queue.size() < 2 )
            return -1;
    
        
        int secondLargestElement = queue.remove();
        
        return (secondLargestElement == queue.poll()) ? -1 : secondLargestElement;
        
    }
}