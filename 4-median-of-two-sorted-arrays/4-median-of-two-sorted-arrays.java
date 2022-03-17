class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int totalLength = nums1.length + nums2.length;
    double median = 0.0;
    int i = 0, j = 0, mid;
    boolean ifEven = false;
    
    if (totalLength % 2 == 1) {
        mid = totalLength / 2 + 1;
        
    }
    else {
        mid = totalLength / 2;
        ifEven = true;
    }
    
    for (int itr = 0; itr < mid; itr++) {
        if (i >= nums1.length) {
            median = nums2[j];
            j++;
            continue;
        }
        else if (j >= nums2.length) {
            median = nums1[i];
            i++;
            continue;
        }
        
        if (nums1[i] < nums2[j]) {
                median = nums1[i];
                i++;
        }
        else if (nums2[j] < nums1[i]) {
            median = nums2[j];
            j++;
        }
        else {
            median = nums1[i];
            i++;
        }
    }
    
    if (ifEven) {
        int next;
        if (i >= nums1.length) {
            next = nums2[j];
        }
        else if (j >= nums2.length) {
            next = nums1[i];
        }
        else {
            next = Math.min(nums1[i], nums2[j]);   
        }
        median = (median + next) / 2;
    }
    
    return median;
    

    }
}