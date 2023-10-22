class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length, i = k, j = k;
        int score = nums[k];
        int min = nums[k];
        while(i > 0 || j < n - 1) {
            if(((i > 0) ? nums[i - 1] : 0) < ((j < n - 1) ? nums[j + 1] : 0)) 
                min = Math.min(min, nums[++j]);
            else min = Math.min(min, nums[--i]);
            score = Math.max(score, min * (j - i + 1));
        }
        return score;
    }
}