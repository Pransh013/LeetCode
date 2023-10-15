public class Solution {
    private int n;
    private int[][] dp;
    private final int MOD = 1000000007;

    public int numWays(int steps, int arrLen) {
       
        arrLen = Math.min(arrLen, steps);
        n = arrLen;
        dp = new int[501][501];
        for (int i = 0; i < 501; i++) Arrays.fill(dp[i], -1);
        return solve(0, steps);
    }
    
    private int solve(int idx, int steps) {
        if (idx < 0 || idx >= n) return 0;

        if (steps == 0) return idx == 0 ? 1 : 0;

        if (dp[idx][steps] != -1) {
            return dp[idx][steps];
        }

        int result = solve(idx + 1, steps - 1) % MOD;
        result = (result + solve(idx - 1, steps - 1)) % MOD;
        result = (result + solve(idx, steps - 1)) % MOD;

        dp[idx][steps] = result;
        return result;
    }
}