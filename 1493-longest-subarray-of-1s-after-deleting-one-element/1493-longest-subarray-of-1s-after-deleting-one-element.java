class Solution {
    public int longestSubarray(int[] nums) {
        int cnt = 0, max = Integer.MIN_VALUE;
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] == 0) cnt++;
            while(cnt > 1) {
                if(nums[j] == 0) cnt--;
                j++;
            }
            max = Math.max(i - j, max);
        }
        return max;
    }
}