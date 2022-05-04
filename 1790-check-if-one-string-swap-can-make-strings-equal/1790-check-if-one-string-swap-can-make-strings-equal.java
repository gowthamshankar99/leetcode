class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.length() != s2.length())
            return false;
        
        if(s1.contentEquals(s2))
            return true;
        
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        
        for(int i=0;i<s1Array.length;i++) {
              for(int j=i+1;j<s1Array.length;j++) {
                swapOperation(s1Array, i, j);
                if(Arrays.equals(s1Array,s2Array)) {
                      return true;       
                } else {
                    // swap it back 
                    swapOperation(s1Array, i, j);
                }
             }
        }
        
        return false;
    }
    
    
    public void swapOperation(char[] nums,int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}