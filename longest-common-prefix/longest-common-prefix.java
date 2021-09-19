class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // base case 

        if(strs.length == 0) 
            return "";

        if(strs.length == 1)
            return strs[0];
        

        
      // sort the array 
       Arrays.sort(strs, new Comparator<String>() {
           public int compare(String a, String  b) {
               return a.length() - b.length();
           }
       });
       
      // get the smallest string
      
      String smallestString = strs[0];
      
      int counter = smallestString.length();  
      
      boolean flag = false;
      while(flag == false) {
           for(int i=1;i<strs.length;i++) {
             ///  System.out.println(smallestString.substring(0,counter));
             ///  System.out.println(strs[i]);
                if(!strs[i].startsWith(smallestString.substring(0,counter)) && counter != 0) {
                      counter--;
                      i = 0;  // reset i
                }
               // if they are equal - move on to the next element    
           }
          
          
          flag = true;
           
      }
        
    
        
        
       
        return smallestString.substring(0,counter);
        
    }
}