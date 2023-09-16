class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        
        int low = 1, high = 0;
        for(int i : nums)
            high = Math.max(high, i);
        
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            
            if(isPossible(nums, threshold, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    public boolean isPossible(int[] nums, int k, int mid) {
        int sum = 0;
        for(int val : nums) {
            sum += val / mid;   
            if(val % mid != 0)
                sum ++;
            
            if(sum > k) return false;
        }
        return true;
    }
}