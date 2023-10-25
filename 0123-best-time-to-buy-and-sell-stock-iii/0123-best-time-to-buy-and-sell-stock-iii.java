class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int buy = a[0], maxProfit = 0;
        int[] dp1 = new int[n];
        for (int i = 1; i < n; i++) {
            if(buy > a[i]) buy = a[i];
            if (a[i] - buy > maxProfit)
                maxProfit = a[i] - buy;
            dp1[i] = maxProfit;
        }

        buy = a[n - 1];
        maxProfit = 0;
        int[] dp2 = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if(buy < a[i]) buy = a[i];
            if (buy - a[i] > maxProfit)
                maxProfit = buy - a[i];
            dp2[i] = maxProfit;
        }

        for (int i = 0; i < n; i++) {
            if (dp1[i] + dp2[i] > maxProfit)
                maxProfit = dp1[i] + dp2[i];
        }
        return maxProfit;
    }
}