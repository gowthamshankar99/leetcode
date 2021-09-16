/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let temp = 1;
    let result = [];
    let left = [temp];
    let right = [temp];
    
    for(let i=0;i<nums.length-1;i++) {
        temp = temp * nums[i];
        left.push(temp);
    }
    temp = 1;
    for(let i=nums.length-1;i>0;i--) {
        temp = temp * nums[i];
        right.unshift(temp);
    }

    
    for(let k=0;k<nums.length;k++) {
        result.push(left[k]*right[k]);
    }
    
    return result;
};

var productExceptSelf2 = function(nums) {
    let result = [];
    let temp = 1;
    for(let i=0;i<nums.length;i++) {
        for(let j=0;j<nums.length;j++) {
            if(i!=j)
                temp = temp*nums[j];
        }
        result.push(temp);
        temp = 1;
    }
    
    return result;
    
};