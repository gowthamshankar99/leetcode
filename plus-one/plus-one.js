/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
        let carryOn = 0;
        let result = [];
        let value = 0;
        for(let i=digits.length-1;i>=0;i--) {
            if(i == digits.length-1) {
                 value = digits[i] + 1;
            } else {
                value = digits[i];
            }
            
            value = value + carryOn;
            // get the carryon number 
            carryOn = Math.floor(value/10);
            
            if(carryOn != 0) {
                result.unshift(0);
            } else {
                result.unshift(value);
            }
        }
    
    // if the carry on  is not zero 
    if(carryOn != 0) {
        result.unshift(1);
    }
        
        return result;
};