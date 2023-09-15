class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int ans = Integer.MIN_VALUE;
        for(int i : piles) {
            ans = Math.max(ans, i);
        }
        
        int low = 1;
        
        int res = -1;
        
        while(low <= ans) {
            int mid = low + ((ans - low) / 2);
            
            int sum = 0;
            for(int pile : piles) {
                int time = pile / mid;
                sum += time;
                
                if(pile % mid != 0)
                    sum ++;
                
                if(sum > h)
                    break;
            }
            
            if(sum <= h) {
                res = mid;
                ans = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}