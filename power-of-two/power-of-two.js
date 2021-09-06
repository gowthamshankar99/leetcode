/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function(n) {
    let result = 0;
    let counter = 0;
    while(result < n) {
        result = Math.pow(2,counter);   
        if(result == n)
            return true
        counter++;
    }
    return false;
};