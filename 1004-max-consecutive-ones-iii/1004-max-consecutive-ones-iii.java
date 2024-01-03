class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt = 0, max = Integer.MIN_VALUE;
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] == 0) cnt++;
            while(cnt > k) {
                if(nums[j] == 0) cnt--;
                j++;
            }
            max = Math.max(i - j + 1, max);
        }
        return max;
    }
}