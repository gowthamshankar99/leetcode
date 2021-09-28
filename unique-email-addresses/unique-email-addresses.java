class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<String>();
        for(String email: emails) {
            String[] parts = email.split("@");
            
            String[] plusNeglect = parts[0].split("\\+");
            
            String newString = plusNeglect[0].replace(".","");
            
            set.add(newString + "@" + parts[1]);
        }
        
        return set.size();
    }
  }