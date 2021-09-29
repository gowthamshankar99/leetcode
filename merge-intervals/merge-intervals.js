/**
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
var insert = function(intervals, newInterval) {
    
    intervals.push(newInterval);
    
    // sort
    intervals.sort(function(a,b) {
        return a[0]-b[0];
    })
    
    if(intervals.length == 0)
        return [newInterval];
    
    if(intervals.length == 1)
        intervals.push(newInterval);
    
    // result array 
    let result = [];

    let previous = intervals[0];
    for(let i=1;i<intervals.length;i++) {
        let current = intervals[i];
        if(previous[1] >= current[0]) {
            // there is an overlap
            let concatatedArray = previous.concat(current);
            concatatedArray.sort(function(a,b) {
                return a-b;
            })
            current = [concatatedArray[0], concatatedArray[concatatedArray.length-1]];
            if(result.length>0)
                result.pop();
            result.push(current);
        } else {
            if(i==1)
                result.push(previous);
            result.push(current);
        }
        // new previous 
        previous = current;
    }
    
    return result;
};
