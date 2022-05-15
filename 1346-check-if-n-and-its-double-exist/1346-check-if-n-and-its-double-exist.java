class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Double> set = new ArrayList<Double>();
        
        for(int element: arr) {
            if(set.contains((2.0*(element))) || set.contains((element/2.0))) {
                return true;
            }
            set.add(element*1.0);
        }
        
        return false;
    }
}