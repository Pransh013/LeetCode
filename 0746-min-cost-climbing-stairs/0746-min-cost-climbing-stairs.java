class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(getMinCost(0, cost, new int[n + 1]), getMinCost(1, cost, new int[n + 1]));
    }
    
    private int getMinCost(int idx, int[] cost, int[] dp) {
        if(idx >= cost.length) return 0;
        if(dp[idx] != 0) return dp[idx];
        int a = cost[idx] + getMinCost(idx + 1, cost, dp);
        int b = cost[idx] + getMinCost(idx + 2, cost, dp);
        return dp[idx] = Math.min(a, b);
    }
}