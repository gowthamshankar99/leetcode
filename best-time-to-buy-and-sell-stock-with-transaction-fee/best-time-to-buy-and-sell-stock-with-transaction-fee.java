/*
 there are two possiblities on a day - own(1) or dont own stock (0)
 
 case 1 : we have stock on day i
 
    a. I bought it today
        dp[i-1][0]-prices[i][1]-fee
  
    b. I am carry forwarding from previous buy
       dp[i-1][1]
 
 
 case 2 : we dont have stock on day i
 
    a. I sold it today
       dp[i-1][1]+prices[i]
    
    b. I sold it on a earlier day
       dp[i-1][0]
*/

class Solution {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length <= 1) {
            return 0;
        }
        
        if(prices.length == 2) {
            if(prices[1] > prices[0]) 
                return prices[1]-prices[0];
            else 
                return 0;
        }
        
        // Initialize the dp array 
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0]-fee;
       // dp[1][0] = Math.max(dp[0][1]+prices[1], dp[0][0]);
       // dp[1][1] = Math.max(dp[0][1], dp[0][0]-prices[1]);

        for(int i=1;i<prices.length;i++) {
            dp[i][0] = Math.max(dp[i-1][1]+prices[i], dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0]-prices[i]-fee, dp[i-1][1]);
        }
        
        return dp[prices.length-1][0];
        }
    }


