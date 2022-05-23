class Solution {
    public int calculateTime(String keyboard, String word) {
        
        int currentIndex = 0;
        int result = 0;
        
        for(int i=0;i<word.length();i++) {
            //System.out.println(keyboard.indexOf(word.charAt(i)));
            
            result = result + Math.abs(keyboard.indexOf(word.charAt(i)) - currentIndex);
            currentIndex = keyboard.indexOf(word.charAt(i));
        }
        return result;
    }
}