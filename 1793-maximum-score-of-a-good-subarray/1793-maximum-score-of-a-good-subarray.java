class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length, i = k, j = k;
        int score = nums[k];
        int min = nums[k];
        while(i > 0 || j < n - 1) {
            int left = (i > 0) ? nums[i - 1] : 0;
            int right = (j < n - 1) ? nums[j + 1] : 0;
            if(left < right) {
                j++;
                min = Math.min(min, right);
            } else {
                i--;
                min = Math.min(min, left);
            }
            score = Math.max(score, min * (j - i + 1));
        }
        return score;
    }
}