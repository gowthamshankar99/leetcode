/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(chars) {
    
    let p1 = chars[0];
    let iLength = chars.length;
    let temp = 1;
    let newTemp = 0;
    let breakFlag = 0;
    
    for(let i=1;i<iLength;i++) {
        breakFlag++;
        if(chars[i] == p1) {
            temp++; 
        } else {
            newTemp = temp;
            let currentI = i;
            while(temp > 0) {
                chars.splice(--currentI,1);
                temp--;
            }
            
            // push the results to the array 
            chars.push(p1);
            if(newTemp > 1) {
                for(let i=0;i<newTemp.toString().length;i++) {
                    chars.push(newTemp.toString()[i]);
                }
                
            }
            // reset temp 
            temp = 1;
            // reset i 
            i = 0;
            p1 = chars[i];
        }
        
        if(breakFlag == iLength-1) {
            break;
        }
    }
    
    newTemp = temp;
    chars.push(chars[0]);
    
    while(temp > 0) {
        chars.shift();
        temp--;
    }
    
    if(newTemp > 1) {
        for(let i=0;i<newTemp.toString().length;i++) {
            chars.push(newTemp.toString()[i]);
        }
    }
    

};