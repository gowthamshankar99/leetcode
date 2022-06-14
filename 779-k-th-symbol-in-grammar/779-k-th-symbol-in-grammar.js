var kthGrammar = function(n, k) {
    if(n === 1) return 0;   //just 1 symbol on the first row
    let parent= kthGrammar(n-1,Math.ceil(k/2));
    let iskOdd= (k%2 === 1);
    if(parent === 1){
        return iskOdd === true ?1 : 0;
    }else{
        return iskOdd === true ?0 : 1;
    }
};