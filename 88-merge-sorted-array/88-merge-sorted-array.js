/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    
   // copy array into a new array 
   let nums1Copy = [...nums1];
   let p1 = 0;
   let p2 = 0;
    
    if(n == 0) {
            return;
        }
    
    if(m == 0) {
         for(let i=0;i<nums1.length;i++)
             {
                 nums1[i] = nums2[i];
             }
         return;
    }
    
   // loop through array until there are elements in it
    for(let i=0;i<m+n; i++) {
        if((nums1Copy[p1] < nums2[p2] && p1 < m) || p2 >= n) {
            nums1[i] = nums1Copy[p1];
            p1++;
        }
        else {
                nums1[i] =  nums2[p2];
                p2++;
         }
      }



};