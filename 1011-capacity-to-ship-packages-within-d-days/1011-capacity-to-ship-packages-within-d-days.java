class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 1, high = 0;
        for(int i : weights)
            high += i;
 
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            
            if(minCapacity(weights, days, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    public boolean minCapacity(int[] weights, int days, int mid) {
        int cnt = 0;
        int temp = mid;
        for(int i=0; i<weights.length;) {
            if(temp - weights[i] >= 0) {
                temp -= weights[i];
                i++;
            } else {
                cnt++;
                temp = mid;
                if(cnt >= days)
                    return false;
            }
        }
        cnt++;
        return cnt <= days;
    }
}