/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    
    let vowelArray = [];
    let result = "";
    
    let va = ['a', 'e', 'i', 'o', 'u'];
    
    for(let i=0;i<s.length;i++) {
        if(va.includes(s[i].toLowerCase())) {
            vowelArray.push(s[i]);
        }
    }
    
    // reverse the vowel array 
    vowelArray.reverse();
    let counter = 0;
    for(let i=0;i<s.length;i++) {
        
        if(va.includes(s[i].toLowerCase())) {
            result = result + vowelArray[counter];
            counter++;
        } else {
            result = result + s[i];
        }
    }
    
    return result;
};
