class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int val : nums) {
            nums[val % n] += n;
        }
        
        int max = -1, maxIdx = -1;
        for(int i=0; i<n; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}