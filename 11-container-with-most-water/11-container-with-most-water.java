class Solution {
    public int maxArea(int[] height) {
        int maxResult = Integer.MIN_VALUE;
        
        int left = 0;
        int right = height.length-1;
        
        while(left < right) {
            int areaCurrent = Math.min(height[left], height[right]) * (right-left);
            maxResult = Math.max(maxResult, areaCurrent);
            
            if(height[left] < height[right]) {
                left++; 
            } else {
                right--;
            }
        }
        return maxResult;
    }
}