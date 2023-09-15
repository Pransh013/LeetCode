class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int ans = Integer.MAX_VALUE;
        
        int low = 1, high = ans;
        
        int res = -1;
        
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            
            long sum = 0;
            for(int i=0; i<n; i++) {
                if(piles[i] % mid == 0)
                    sum += piles[i] / mid;
                else if(piles[i] < mid)
                    sum += 1;
                else
                    sum += (piles[i] / mid) + 1;
            }
            // System.out.println(sum);
            // System.out.println(mid);
            if(sum <= h) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}