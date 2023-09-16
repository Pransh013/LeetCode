class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m * k > n) return -1;
        
        int low = 0, high = 0, res = -1;
        for(int i : bloomDay) {
            low = Math.min(low, i);
            high = Math.max(high, i);
        }
        
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            if(noOfFlowers(bloomDay, mid, m, k)) {
                res = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return res;
    }
    public boolean noOfFlowers(int[] arr, int mid, int m, int k) {
        int cnt = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= mid)
                cnt++;
            else {
                sum += cnt / k;
                cnt = 0;
            }
        }
        sum += cnt / k;
        return sum >= m;
    }
}