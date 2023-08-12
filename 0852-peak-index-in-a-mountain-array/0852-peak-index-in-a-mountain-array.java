class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i=1; i<n; i++) {
            if(arr[i] > arr[i-1])
                max = i;
            else break;
        }
        return max;
    }
}