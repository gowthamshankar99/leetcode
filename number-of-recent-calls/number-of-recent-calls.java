class RecentCounter {

    List<Integer> list;
    public RecentCounter() {
        list = new ArrayList<Integer>();
    }
    
    public int ping(int t) {
        list.add(t);
        int timeDifference = t - 3000;
        int result = 0;
        System.out.println(timeDifference);
        for(int i=0;i<this.list.size();i++) {
            if(list.get(i) >= timeDifference) {
                result++;
            }
        }
        
        return result;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 
    3002 - 3000 = 2 
    [100, 3001, 3002]
    
    
    [1]
    1 - 3000 = -2999
    if values in the array is greater than the answer - incremenrt
     
     
 */