class Solution {
    public boolean isPalindrome(int x) {
        
        int halfValue = 0;
        // loop until the new string is bigger than the x value 
         if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        while(x > halfValue) {
            halfValue = halfValue * 10 + x%10;
            x = x /10;
        }
        
        System.out.println(halfValue);
        System.out.println(x);
        
        return halfValue == x || halfValue/10 == x;
    }
}