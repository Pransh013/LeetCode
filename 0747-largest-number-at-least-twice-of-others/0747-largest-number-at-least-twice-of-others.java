class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, maxNum = -1;
        int n = nums.length;
        
        for(int i=0; i<n; i++) {
            if(nums[i] >= nums[max]) {
                max = i;
                maxNum = nums[i];
            }
                
        }
        
        for(int i=0; i<n; i++) {
            if(i == max)
                continue;
            
            if(2 * nums[i] > maxNum)
                return -1;
        }
        
        return max;
    }
}