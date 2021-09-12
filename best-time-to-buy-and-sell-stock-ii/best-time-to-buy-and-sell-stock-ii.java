class Solution {
    public int maxProfit(int[] prices) {
        
        int previous = prices[0];
        int result = 0;
        for(int i=1;i<prices.length;i++) {
            if(previous < prices[i]) {
                result = result + (prices[i]-previous);
            }
            
            previous = prices[i];
        }
        
        return result;
    }
}