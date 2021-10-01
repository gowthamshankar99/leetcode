/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    // result variable
    let result = 0;
    // create the hashset
    let mySet = new Set();
    
    for(let i=0;i<s.length;i++) {
        
        let currentTemp = s[i];
        if(mySet.has(currentTemp)) {
            // find the index at which the value is at 
            removeElement(mySet, currentTemp)
            // reset the set 
            mySet.add(s[i]);
        }
        else {
            mySet.add(s[i]);
        }
        
        result = Math.max(result, mySet.size);
    }
    return result;    
};

function removeElement(myset, element) {
    for (let item of myset) {
        if(item==element) {
            myset.delete(item);
            break;
        }
        myset.delete(item);
    }
}