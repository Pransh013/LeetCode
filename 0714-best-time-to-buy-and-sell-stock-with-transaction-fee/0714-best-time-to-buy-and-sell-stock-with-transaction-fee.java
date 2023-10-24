class Solution {
    public int maxProfit(int[] a, int fee) {
        int n = a.length;
        int oldBuy = -a[0];
        int oldSell = 0;
        
        for(int i = 1; i < n; i++) {
            int newBuy = 0;
            int newSell = 0;
            if(oldSell - a[i] > oldBuy) newBuy = oldSell - a[i];
            else newBuy = oldBuy;
            
            if(a[i] + oldBuy - fee > oldSell) newSell = a[i] + oldBuy - fee;
            else newSell = oldSell;
            
            oldBuy = newBuy;
            oldSell = newSell;
        }
        return oldSell;
    }
}