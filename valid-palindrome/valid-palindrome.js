/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    
    // remove special characters

    s = s.replace(/[^a-zA-Z0-9 ]/g, ""); 
    s = s.replace(/\s/g, "");
    
    
    s = s.toLowerCase();
    
    
    for(let i=0;i<s.length/2;i++) {
        console.log(s[i] + " " + s[s.length-1-i]);
        if(s[i] != s[s.length-1-i]) {
            return false;
        }
    }
    
    return true;    
};