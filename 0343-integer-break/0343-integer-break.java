class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[60];
        
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 4;
        
        for(int i = 5; i <= n; i++) {
            int num = i;
            for(int j = 1; j <= num; j++) {
                int x = j;
                int y = num - x;
                dp[i] = Math.max(dp[i], x*y);
                dp[i] = Math.max(dp[i], dp[x]*y);
                dp[i] = Math.max(dp[i], x*dp[y]);
                dp[i] = Math.max(dp[i], dp[x]*dp[y]);
            }
        }
        return dp[n];
    }
}