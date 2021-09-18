class Solution {
    public int missingNumber(int[] arr) {
        
        if(arr[0] == arr[1])
            return arr[0];
        
        int minimumDifference = Integer.MAX_VALUE;
        int maximumDifference = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i+1] > arr[i]) {
                minimumDifference = Math.min(minimumDifference, arr[i+1]-arr[i]);
                maximumDifference = 0;
            }
            else {
                maximumDifference = Math.max(maximumDifference, arr[i+1]-arr[i]);
                minimumDifference = 0;
            }
        }
        
        int difference = (minimumDifference == 0) ? maximumDifference : minimumDifference;
        
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i+1] - arr[i] != difference) {
                return arr[i] + difference;
            }
        }
        
        return -1;

    }
}