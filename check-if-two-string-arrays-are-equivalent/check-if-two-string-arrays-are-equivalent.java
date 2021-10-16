class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=0;i<word1.length;i++) {
            sb1.append(word1[i]);
        }
        
        for(int j=0;j<word2.length;j++) {
            sb2.append(word2[j]);
        }
        
        return sb1.toString().contentEquals(sb2.toString());
        
    }
}