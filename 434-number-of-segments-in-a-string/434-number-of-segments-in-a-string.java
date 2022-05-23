class Solution {
    public int countSegments(String s) {
        
        String[] arr = s.split(" ");
        
        int result = 0;
        
        for(int i=0;i<arr.length;i++) {
            if(!arr[i].contentEquals(""))
                result++;
        }
        
        
        
        return result;
        
    }
}