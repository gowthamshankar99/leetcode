class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        
        for(int i=0;i<s1.length();i++) {
            arr[s1.charAt(i)-'a']++;
        }
        int len = s1.length();
        int start = 0;
        int end = 0;
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        while((start + len) <= s2.length()) {
            String currSubString = s2.substring(start, start+len);
            for(int i=0;i<currSubString.length();i++) {
                arrCopy[currSubString.charAt(i)-'a']--;
            }
            
            if(checkArr(arrCopy))
                return true;
            else {
                start++;
                arrCopy = Arrays.copyOf(arr, arr.length);
            }
        }
        return false;
    }
    
    public boolean checkArr(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) 
                return false;
        }
        return true;
    }
    
} 