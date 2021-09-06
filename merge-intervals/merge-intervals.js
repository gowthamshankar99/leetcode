/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {

    intervals.sort(function(a,b) {
        return a[0] - b[0]
    });
    if(intervals.length < 2) {
        return intervals;
    }
    // first element 
    let previous = intervals[0];
    
    // result array 
    let result = [];
      
    // loop through the array 
    for(let i=1;i<intervals.length;i++) {
        let current = intervals[i];
        if(previous[1] >= current[0]) {
            // there is a overlap
            let flattenedArray = [previous, current].flat().sort(function(a,b) {
                return a-b;
            });
            // pop the last element
            result.pop();
            result.push([flattenedArray[0],flattenedArray[3]]);
        } else {
            if(i == 1)
                // add the first Element 
                result.push(previous);
            result.push(intervals[i]);
        }
        // replace previous value 
        previous = result[result.length-1];
    }
    return result;
};