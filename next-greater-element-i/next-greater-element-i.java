class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // result list
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i=0;i<nums1.length;i++) {
            int result = -1;
            for(int j=0;j<nums2.length;j++) {      
                    if(nums1[i] == nums2[j]) {
                        while(j < nums2.length) {
                            if(nums1[i] < nums2[j]) {
                                result = nums2[j];
                                break;
                            }
                            j++;
                        }
                    }                
            }
            // push to res
            res.add(result);
        }
        
        int[] resArray = new int[res.size()];
        
        int counter = 0;
        for(int i : res) {
            resArray[counter] = i;
            counter++;
        }  
        return resArray;
    }
}

/*



*/