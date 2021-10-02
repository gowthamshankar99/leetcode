class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        // result
        int result = 0;
        
        char previous = s.charAt(0);
        result += result + map.get(previous);
        for(int i=1;i<s.length();i++) {
            char current = s.charAt(i);
            if(map.get(previous) < map.get(current)) {
                 result -= map.get(previous)*2;
                 result += map.get(current);
            } else {
                result += map.get(current);
            }
            
            // update previous
            previous = current;
        }

        
        return result;
        
    }
}