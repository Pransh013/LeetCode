class Solution {
    public int maxProfit(int k, int[] a) {
        int n = a.length;
        int[][] dp = new int[k + 1][n];
        for (int r = 1; r <= k; r++) {
            for (int c = 1; c < n; c++) {
                int max = Integer.MIN_VALUE;
                max = Math.max(max, dp[r][c - 1]);
                for (int i = c - 1; i >= 0; i--) {
                    int curr = dp[r - 1][i] + a[c] - a[i];
                    if (curr > max)
                        max = curr;
                }
                dp[r][c] = max;
            }
        }
        return dp[k][n - 1];
    }
}