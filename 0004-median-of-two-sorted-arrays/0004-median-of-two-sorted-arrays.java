class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length ;
        int n = nums2.length ;
        int k = m+n;
        
        int[] newArr = new int[k];
        for(int i=0; i<m; i++) {
            newArr[i] = nums1[i];
        }
        for(int i=0; i<n; i++) {
            newArr[i+m] = nums2[i];
        }
        
        Arrays.sort(newArr);
        
        double ans = 0.0;
        
        if(k%2 == 0) {
            ans =(double)(newArr[k/2] + newArr[(k/2)-1])/2;
        } else {
            ans = newArr[k/2];
        }
        return ans;
    }
}