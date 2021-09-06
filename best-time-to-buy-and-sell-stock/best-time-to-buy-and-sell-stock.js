/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
        // sliding window technique
        
        let minValue = Number.MAX_SAFE_INTEGER
        let maxValue = 0;
    
        for(let i=0;i<prices.length;i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            }
            else {
                maxValue = Math.max(maxValue, prices[i] - minValue);
            }
        }
        return maxValue;
};