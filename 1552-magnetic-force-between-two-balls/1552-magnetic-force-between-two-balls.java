class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1, high = position[n-1] - position[0];
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(canPlaceBall(position, mid, m)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static boolean canPlaceBall(int[] arr, int mid, int m) {
        int prev = arr[0];
        
        for(int val : arr) {
            if(val - prev >= mid) {
                m--;
                prev = val;
            }
            if(m == 1) break;
        }
        return m == 1;
    }
}