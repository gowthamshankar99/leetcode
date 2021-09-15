class Solution {
    public int maxProfit(int[] prices) {
        
        int result = 0;
        int minValue = Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            } else {
                result = Math.max(result, (prices[i] - minValue));
            }
        }
        
        return result;
    }
}