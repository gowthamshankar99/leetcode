class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<Character>();
        
        for(int i=0;i<t.toCharArray().length;i++) {
            list.add(t.charAt(i));
        }
        
        for(int j=0;j<s.toCharArray().length;j++) {
            if(list.contains(s.charAt(j))) {
                list.remove(list.indexOf(s.charAt(j)));
            }
        }

        
        return list.get(0);
    }
}