/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    
    // remove special characters

    s = s.replace(/[^a-zA-Z0-9 ]/g, ""); 
    s = s.replace(/\s/g, "").toLowerCase();
    
    console.log(s);
    
    for(let i=0;i<s.length/2;i++) {
        if(s[i] != s[s.length-1-i]) {
            return false;
        }
    }
    
    return true;
    
    
    //return s.toLowerCase() == s.split("").reverse().join("").toLowerCase()
    
};