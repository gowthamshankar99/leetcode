class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        
        
        // create a HashMap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        char[] stonesArray = stones.toCharArray();
        
        for(int i=0;i<stonesArray.length;i++) {
            map.put(stonesArray[i], map.getOrDefault(stonesArray[i], 0) + 1);
        }
        
        // another loop to get the output
        int result = 0;
        
        char[] jewelsArray = jewels.toCharArray();
        
        for(int j=0;j<jewelsArray.length;j++) {
            result = result + map.getOrDefault(jewelsArray[j], 0);
        }
        
        return result;
    }
}