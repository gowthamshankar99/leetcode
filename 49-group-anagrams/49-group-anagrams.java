class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // result list 
        List<List<String>> result = new ArrayList<List<String>>();
        
        // create a hashmap 
        HashMap<String, List<String>> map = new HashMap<>();
        
        // loop throug the array 
        for(int i=0;i<strs.length;i++) {
            // for every element - sort the element 
            
            char[] elementArray = strs[i].toCharArray();
            Arrays.sort(elementArray);
            
            
            String element = new String(elementArray);
            
        
             // check if the hashmap has the sorted element - if so  add to the key 
             if(map.containsKey(element))     {
                 List<String> existingList = map.get(element);
                 existingList.add(strs[i]);
                 map.put(element, existingList);
             } else {
                 // element doesnt exist - if the hashmap doesnt have the sorted element - add the sorted element and value as the original element     
                 List<String> newEleList = new ArrayList<String>();
                 newEleList.add(strs[i]);
                 map.put(element, newEleList);
             }
            

        }
    
        // loop through the hashmap 
        
        for(List<String> singleList : map.values()) {
            // add the values to the result list    
            result.add(singleList);
        }
        
        
        
        return result;
        
    }
    
    
}