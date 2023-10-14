public class Solution {
    int n;
    int[][] dp;

    public int paintWalls(int[] cost, int[] time) {
        n = cost.length;
        dp = new int[501][501];
        for (int[] row : dp)Arrays.fill(row, -1);
        return getMinCost(0, n, cost, time);
    }
    public int getMinCost(int idx, int rem, int[] cost, int[] time) {
        if (rem <= 0) return 0;
        if (idx == n) return 1000000000;
        if (dp[idx][rem] != -1) return dp[idx][rem];

        int doIt = cost[idx] + getMinCost(idx + 1, rem - 1 - time[idx], cost, time);
        int dont = getMinCost(idx + 1, rem, cost, time);

        return dp[idx][rem] = Math.min(doIt, dont);
    }
}