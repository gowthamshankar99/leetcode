/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    
    let result2 = [[1]];
    let element = [1];
    let elementCopy = [...element];
    
    for(let i=1;i<numRows;i++) {
        elementCopy = [...element];
        element = putTogetherArray(elementCopy);
        result2.push(element);
    }
    
    return result2;
    
};


var putTogetherArray = function(arr) {
    let start = 0;
    let end = arr.length;
    
    // result arr
    let result = [];
    arr.unshift(0);
    arr.push(0);
    
    for(let i=0;i<arr.length-1;i++) {
        result.push(arr[i]+arr[i+1]);
    }
    
    return result;
}