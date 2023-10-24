class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1) return 0;
        int min = prices[0];
        int max = -1;
        int maxP = 0;
        for(int i = 1; i < n; i++) {
            if(prices[i] > prices[i - 1]) {
                max = prices[i];
            } else if(prices[i] < prices[i - 1]) {
                maxP += ((max - min) >= 0 ? max - min : 0);
                min = prices[i];
                max = 0;
            }
        }
        if(max > min) maxP += ((max - min) >= 0 ? max - min : 0);
        return maxP >= 0 ? maxP : 0;
    }
}