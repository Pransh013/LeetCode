class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), cnt = 0;
        boolean[][] dp = new boolean[n][n];
        
        for(int gap = 0; gap < n; gap++) {
            for(int i = 0, j = gap; j < n; i++, j++) {
                if(gap == 0) dp[i][j] = true;
                else if(gap == 1) dp[i][j] = s.charAt(i) == s.charAt(j);
                else {
                    if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1])
                        dp[i][j] = true;
                }
                if(dp[i][j]) cnt++;
            }
        }
        return cnt;
    }
}