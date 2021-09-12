/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isMonotonic = function(nums) {
    
    
    return increasingFunction(nums) || decreasingFunction(nums);

};
    
function increasingFunction(nums) {
    let previous = nums[0];
    for(let i=1;i<nums.length;i++) {
       if(nums[i] < previous) {
             return false;    
       }
        previous = nums[i];
    }
    
    return true;
}
    

function decreasingFunction(nums) {
    let previous = nums[0];
    for(let i=1;i<nums.length;i++) {
       if(nums[i] > previous) {
             return false;    
       }
        previous = nums[i];
    }
    
    return true;
}