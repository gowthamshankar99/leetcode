/**
 * @param {number[]} nums
 * @return {number}
 */
var countQuadruplets = function(nums) {
    
    let result = 0;
    
    for(let i=0;i<nums.length;i++) {
       for(let j=i+1;j<nums.length;j++) {
          for(let k=j+1;k<nums.length;k++) {
              for(let m=k+1;m<nums.length;m++) {
                 if(nums[i] + nums[j] + nums[k] == nums[m]) {
                     result++;
                 }   
              }
            }
        } 
    }
    return result;
};