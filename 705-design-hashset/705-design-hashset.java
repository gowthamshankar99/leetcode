class MyHashSet {
    
    public final int ARRAYSIZE = 100;
    public final int MAXVALUE = 1000000;
    List<List<Integer>> parentList;
    
    
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        parentList = new ArrayList<List<Integer>>();
        for(int i=0;i<ARRAYSIZE;i++) {
            parentList.add(null);
        }
    }
    
    public void add(int key) {
       int getHashValue = key%ARRAYSIZE;
        List<Integer> childList = parentList.get(getHashValue);
       if(parentList.get(getHashValue) != null) {
           if(!childList.contains(key)){
                childList.add(key);
           }
       } else {
           // if the list is null
            childList = new LinkedList<Integer>();
            childList.add(key);
            
       }
        parentList.set(getHashValue, childList);
    }
    
    public void remove(int key) {
        int getHashValue = key%ARRAYSIZE;
        List<Integer> childList = parentList.get(getHashValue); 
        if(childList != null) {
            if(childList.contains(key))
                childList.remove(Integer.valueOf(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int getHashValue = key%ARRAYSIZE;
        if(parentList.get(getHashValue) != null) {
            List<Integer> childList = parentList.get(getHashValue); 
            if(childList.contains(key)) {
                return true;
            } else {
                return false;
            }
        } else 
        {
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */