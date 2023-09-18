class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int i : weights) {
            high += i;
            low = Math.max(low, i);
        }
 
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
        int load = 0, noOfDays = 1;
        for(int i=0; i<weights.length; i++) {
            if(load + weights[i] > mid) {
                noOfDays++;
                if(noOfDays > days) return false;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return noOfDays <= days;
    }
}