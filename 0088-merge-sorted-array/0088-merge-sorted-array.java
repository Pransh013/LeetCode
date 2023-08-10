class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1;
        for(int ele: nums2) {
            nums1[i] = ele;
            i--;
        }
        Arrays.sort(nums1);
    }
}