class Solution {
    public int maxProfit(int[] a, int fee) {
        int n = a.length;
        int buy = -a[0];
        int sell = 0;
        
        for(int i = 1; i < n; i++) {
            if(sell - a[i] > buy) buy = sell - a[i];
            if(a[i] + buy - fee > sell) sell = a[i] + buy - fee;
        }
        return sell;
    }
}