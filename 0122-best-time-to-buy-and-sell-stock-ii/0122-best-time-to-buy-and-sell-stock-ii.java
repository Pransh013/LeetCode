class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int min = 0;
        int max = 0;
        int profit = 0;
        for(int i = 1; i < n; i++) {
            if(a[i] >= a[i - 1]) max++;
            else {
                profit += a[max] - a[min];
                max = min = i;
            }
        }
        profit += a[max] - a[min];
        return profit;
    }
}