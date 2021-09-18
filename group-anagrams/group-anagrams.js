/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    
    let result = [];
    // create map 
    let map = new Map();
    for(let i=0;i<strs.length;i++) {
        let sortedValue = strs[i].split("").sort().join("");
        if(map.has(sortedValue)) {
            let arr = map.get(sortedValue);
            arr.push(strs[i]);
        } else {
            map.set(sortedValue, [strs[i]]);
        }
    }
    
    for (const value of map.values()) {
        result.push(value);
    }

    return result;
};