/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    let result = [];
    for(let i=0;i<nums2.length;i++) {
        if(nums1.includes(nums2[i]) && !result.includes(nums2[i])) {
            
            result.push(nums2[i]);
        } 
    }
    return result;
};