class Solution {
    public String frequencySort(String s) {
        // input character to array 
        char[] charStringArray = s.toCharArray();
        
        // hashmap
        HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        
        for(int i=0;i<charStringArray.length;i++) {
            map.put(charStringArray[i], map.getOrDefault(charStringArray[i], 0) + 1);
        }
        
        Map<Character, Integer> hm1 = sortByValue(map);
        
        StringBuilder sb = new StringBuilder();
 
        // print the sorted hashmap
        for (Map.Entry<Character, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
            
            int copies = en.getValue();
            for(int i=0;i<copies;i++) {
                sb.append(en.getKey());
            }
        }
        
        return sb.toString();
    }
    
    // function to sort hashmap by values
    public static HashMap<Character, Integer>
    sortByValue(HashMap<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list
            = new LinkedList<Map.Entry<Character, Integer> >(
                hm.entrySet());
 
        // Sort the list using lambda expression
        Collections.sort(
            list,
            (i1,
             i2) -> i2.getValue().compareTo(i1.getValue()));
 
        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp
            = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}