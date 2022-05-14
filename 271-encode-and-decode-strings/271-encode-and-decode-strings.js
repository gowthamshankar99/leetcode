/**
 * Encodes a list of strings to a single string.
 *
 * @param {string[]} strs
 * @return {string}
 */
var encode = function(strs) {
    let tempStr = "";
    for(let i=0;i<strs.length;i++) {
          tempStr = tempStr + "%^&*" + strs[i];
    }
    
    return tempStr.substring(4, tempStr.length);
};

/**
 * Decodes a single string to a list of strings.
 *
 * @param {string} s
 * @return {string[]}
 */
var decode = function(s) {
    
    return s.split("%^&*")
};

/**
 * Your functions will be called as such:
 * decode(encode(strs));
 */