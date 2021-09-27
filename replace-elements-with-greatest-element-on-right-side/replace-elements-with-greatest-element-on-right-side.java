class Solution {
    public int[] replaceElements(int[] arr) {
        
        
        int[] result = new int[arr.length];
        if(arr.length == 0)
            return result;
        if(arr.length == 1) {
            result[0] = -1;
            return result;
        }
        
        int maxElement = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(i+2 == arr.length) {
                maxElement = arr[arr.length-1];
                result[i] = maxElement;
            }
            for( int j=i+1;j<arr.length-1;j++) {
                if(arr[j] < arr[j+1]) {
                    maxElement = Math.max(maxElement, arr[j+1]);
                } else {
                    maxElement = Math.max(maxElement, arr[j]);
                }
            }
            result[i] = maxElement;
            maxElement = Integer.MIN_VALUE;
        }
        
        // update the last value 
        result[result.length-1] = -1;
        
        return result;
    }
}