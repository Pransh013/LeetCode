class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int ans = Integer.MAX_VALUE;
        
        int low = 1, high = ans;
        
        int res = -1;
        
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            
            int sum = 0;
            for(int i=0; i<n; i++) {
                int time = piles[i] / mid;
                sum += time;
                
                if(piles[i] % mid != 0)
                    sum ++;
            }
            
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