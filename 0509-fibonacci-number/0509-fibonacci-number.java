class Solution {
    public int fib(int n) {
        return getFib(n, new int[n + 1]);
    }
    private int getFib(int n, int[] dp) {
        if(n == 0 || n == 1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = getFib(n - 1, dp) + getFib(n - 2, dp);
    }
}