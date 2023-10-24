class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        if(n == 1) return 0;
        if(n == 2) return (a[0] >= a[1] ? 0 : a[1] - a[0]);
        int[] dp = new int[n];
        dp[1] = a[0];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], a[i - 1]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++)
            max = Math.max(max, a[i] - dp[i]);
        return ((max >= 0) ? max : 0);
    }
}