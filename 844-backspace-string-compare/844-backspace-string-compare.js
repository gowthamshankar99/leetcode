/**
 * @param {string} S
 * @param {string} T
 * @return {boolean}
 */
var backspaceCompare = function(S, T) {
    TArray = T.split("");
    SArray = S.split("");
        
    S = iterationFunction(S,SArray);
    T = iterationFunction(T, TArray);
        
    return (T==S)
};

function iterationFunction(str,arr)
{
    for(let i=0;i<str.length;i++)
    {
        if(str[i] == "#")
            {
                if(i==0)
                {
                    arr.shift();
                    str = arr.join("");
                    i = i - 1;
                }
                else
                {
                    arr.splice(i-1,2);
                    str = arr.join("");
                    i = i - 2;
                }
               
            }
    }

    return str;
}