class Solution {
    public int trap(int[] height) {
        int n = height.length, sum = 0;
        int[] left = leftGreater(height, n);
        int[] right = rightGreater(height, n);
        
        for(int i = 0; i < n; i++) {
            int ans = Math.min(left[i], right[i]) - height[i];
            if(ans > 0)  sum += ans;
        }
        return sum;
    }
    public int[] leftGreater(int[] arr, int n) {
        int[] left = new int[n];
        int val = 0;
        for(int i = 0; i < n; i++) {
            left[i] = val;
            if(arr[i] > val)
                val = arr[i];
        }
        return left;
    }
    
    public int[] rightGreater(int[] arr, int n) {
        int[] right = new int[n];
        int val = 0;
        for(int i = n - 1; i >= 0; i--) {
            right[i] = val;
            if(arr[i] > val)
                val = arr[i];
        }
        return right;
    }
}