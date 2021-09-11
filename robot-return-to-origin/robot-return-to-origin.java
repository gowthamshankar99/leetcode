class Solution {
    public boolean judgeCircle(String moves) {
        // create an arrayList to store the elements
        List<Character> list = new ArrayList<Character>();
        
        char[] charArray = moves.toCharArray();
        // loop through the string 
        for(int i=0;i<charArray.length;i++) {
                    
            // checkk if the opposite elemt is in the list 
            if(charArray[i] == 'U') {
                if(!list.isEmpty() && list.contains('D')) {
                    // remove the element from array 
                    list.remove(list.indexOf('D'));
                }   else {
                // add to array 
                list.add(charArray[i]);
            }    
            }
            
            // checkk if the opposite elemt is in the list 
            if(charArray[i] == 'D') {
                if(!list.isEmpty() && list.contains('U')) {
                    // remove the element from array 
                     list.remove(list.indexOf('U'));
                }  else {
                // add to array 
                list.add(charArray[i]);
            }    
            } 
            
                        // checkk if the opposite elemt is in the list 
            if(charArray[i] == 'L') {
                if(!list.isEmpty() && list.contains('R')) {
                    // remove the element from array 
                     list.remove(list.indexOf('R'));
                }  else {
                // add to array 
                list.add(charArray[i]);
            }    
            } 
            
                      // checkk if the opposite elemt is in the list 
            if(charArray[i] == 'R') {
                if(!list.isEmpty() && list.contains('L')) {
                    // remove the element from array 
                     list.remove(list.indexOf('L'));
                }  else {
                // add to array 
                list.add(charArray[i]);
            }    
            }   

        }
        return list.isEmpty() ? true : false;
    }
}