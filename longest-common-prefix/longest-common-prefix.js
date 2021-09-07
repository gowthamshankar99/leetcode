/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let result = "";
     // get the smallest array and its length
    let tempLength = Number.MAX_SAFE_INTEGER;
    let smallestIndex = 0;
    
     for(let i=0;i<strs.length;i++) {
         if(strs[i].length < tempLength) {
             smallestIndex = i;
             tempLength = strs[i].length;
         }
     }

    
    let smallestString = strs[smallestIndex];
    
    while(smallestString.length > 0) {
        let resultFlag = strs.every(function(data) {
            return data.startsWith(smallestString)
        });
        
        if(resultFlag) 
            break;
        else 
            smallestString = smallestString.substring(0,smallestString.length-1);
    }
    
    return smallestString;
};