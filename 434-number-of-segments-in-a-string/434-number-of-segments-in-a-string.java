class Solution {
    public int countSegments(String s) {
        
        String[] arr = s.split(" ");
        
        if(s.trim().contentEquals("")) 
            return 0;
        
        int result = 0;
        
        for(int i=0;i<arr.length;i++) {
            if(!arr[i].contentEquals(""))
                result++;
        }
        
        
        
        return result;
        
    }
}