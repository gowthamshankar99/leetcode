class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Double> set = new ArrayList<Double>();
        
        for(int element: arr) {
            if(set.contains((double)(2*element)) || set.contains(((double)element/2))) {
                return true;
            }
            set.add((double)element);
        }
        
        return false;
    }
}