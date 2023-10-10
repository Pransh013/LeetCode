class Solution {
    public int climbStairs(int n) {
        return countPaths(n, new int[n + 1]);
    }
    public int countPaths(int n, int[] dp) {
        if(n == 0) return 1;
        if(dp[n] != 0) return dp[n];
        int path1 = 0, path2 = 0;
        path1 = countPaths(n - 1, dp);
        if(n > 1) path2 = countPaths(n - 2, dp);
        return dp[n] = path1 + path2;
    }
}