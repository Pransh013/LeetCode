class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int ele: arr) sum+=ele;
        int leftSum = 0;
        for(int i=0; i<n; i++) {
            leftSum = (i==0) ? 0:leftSum+arr[i-1];
            int rightSum = sum - leftSum - arr[i];
            
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}