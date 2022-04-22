class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        //Arrays.sort(piles);
        
        int maxValue = 1;
        for (int pile : piles) {
            maxValue = Math.max(maxValue, pile);
        }
        
        int start = 1;
        int end = maxValue;
        int res = 0;
        int tempAnswer = -1;
        while(start <= end) {
            int mid = (start + end)/2;
            res = processBana(piles, mid, h);
            if(res < 0) {
                start = mid + 1;
            } else {
                // worked - but lets try for a better solution 
                tempAnswer = res;
                end = mid - 1;
                
            }
        }
    

        return (res==-1) ? tempAnswer : res;
    }
    
    public int processBana(int[] piles, int noOfBananas, int h) {
            
            int hoursSpent = 0;
            for(int pile : piles) {
                int quo = pile/noOfBananas;
                int rem = pile%noOfBananas;
                
                hoursSpent = hoursSpent + quo;
                if(rem > 0)
                    hoursSpent = hoursSpent + 1; 
                
                if(hoursSpent > h) {
                    return -1;
                }
            }
        
        return noOfBananas;
        
    }
    
    public int test(int[] piles, int h) {
        Arrays.sort(piles);
        if(h == piles.length)
            return piles[piles.length-1];
        
        
        int noOfBanannas = 1;
        
        while(true) {
            int hoursSpent = 0;
            for(int pile : piles) {
                int quo = pile/noOfBanannas;
                int rem = pile%noOfBanannas;
                
                hoursSpent = hoursSpent + quo;
                if(rem > 0)
                    hoursSpent = hoursSpent + 1; 
                
                if(hoursSpent > h) {
                    break;
                }
            }
            
            if(hoursSpent <= h) {
                return noOfBanannas;
            } else {
                noOfBanannas = noOfBanannas + 1;
            }
        }
    }
}


    