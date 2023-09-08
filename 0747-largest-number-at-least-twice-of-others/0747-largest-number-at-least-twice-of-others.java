class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = -1, maxNum = -1, secondMax = -1;
        int n = nums.length;
        
        for(int i=0; i<n; i++) {
            if(nums[i] > maxNum) {
                secondMax = maxNum;
                maxNum = nums[i];
                maxIndex = i;
            } else if(nums[i] > secondMax) 
                secondMax = nums[i];
        }
        
        return (maxNum >= 2 * secondMax) ? maxIndex : -1;
    }
}