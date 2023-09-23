class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int maxProfit = 0;
        int min = prices[0];
        for(int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}