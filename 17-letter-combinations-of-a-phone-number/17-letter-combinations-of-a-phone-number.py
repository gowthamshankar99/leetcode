class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        outputArray = []
        mydict={"2" : "abc", 
                "3": "def", 
                "4": "ghi", 
                "5": "jkl", 
                "6": "mno",
                "7": "pqrs",
                "8": "tuv",
                "9": "wxyz"}
        
    
        def combinations(comb, nextdigits):
            if(len(nextdigits) == 0):
                output.append(comb)
            else:
                for letter in mydict[nextdigits[0]]:
                    combinations(comb+letter, nextdigits[1:])
        output=[]
        if digits:
            combinations("", digits)
        return output


        