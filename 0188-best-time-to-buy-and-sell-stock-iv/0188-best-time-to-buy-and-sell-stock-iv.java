class Solution {
    public int maxProfit(int k, int[] a) {
        int n = a.length;
        int[][] dp = new int[k + 1][n];
        for (int r = 1; r <= k; r++) {
            int max = Integer.MIN_VALUE;
            for (int c = 1; c < n; c++) {
                if(dp[r - 1][c - 1] - a[c - 1] > max) max = dp[r - 1][c - 1] - a[c - 1];
                dp[r][c] = max + a[c] > dp[r][c - 1] ? max + a[c] : dp[r][c - 1];
            }
        }
        return dp[k][n - 1];
    }
}