/**
 * @param {number[][]} dominoes
 * @return {number}
 */
var numEquivDominoPairs = function(dominoes) {
      
    

    let result = 0;
     for(let i=0;i<dominoes.length;i++) {
         let previous = dominoes[i];
         for(let j=i+1;j<dominoes.length;j++) {
             let current = dominoes[j];
             if((previous[0] == current[0] && previous[1] == current[1]) || (previous[0] == current[1] && previous[1] == current[0]) )
                 result++;
      }
    }
    
    console.log(dominoes);
    return result;
    
};