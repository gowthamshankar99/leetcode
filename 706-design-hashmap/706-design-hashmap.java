class MyHashMap {

    int[] map; 
    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new int[1000001];
        //Arrays.fill(map, 0);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        map[key] = value;
        if(value == 0)
            map[key] = -2;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(map[key] == -2)
            return 0;
        if(map[key] == 0)
            return -1;
        return map[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */