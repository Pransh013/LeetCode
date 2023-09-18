class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        
        for(int i=1; i<n; i++) 
            arr[i] = arr[i] + arr[i-1];
        
        if(k == n) return arr[n-1];
        
        int max = arr[n-1] - arr[n-k-1];            // sum of last k cards
        
        for(int i=0; i<k; i++) {
            int left = arr[i];
            int right = arr[n-1] - arr[n-k+i];
            
            max = Math.max(max, left + right);
        }
        return max;
    }
}