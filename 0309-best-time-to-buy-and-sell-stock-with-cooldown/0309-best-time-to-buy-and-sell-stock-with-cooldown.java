class Solution {
    public int maxProfit(int[] a) {
        int oldBuy = -a[0], oldSell = 0, oldCool = 0;
        
        for(int i = 1; i < a.length; i++) {
            int newBuy = 0, newSell = 0, newCool = 0;
            if(oldCool - a[i] > oldBuy) newBuy = oldCool - a[i];
            else newBuy = oldBuy;
            if(oldBuy + a[i] > oldSell) newSell = oldBuy + a[i];
            else newSell = oldSell;
            if(oldSell > oldCool) newCool = oldSell;
            else newCool = oldCool;
            
            oldBuy = newBuy;
            oldSell = newSell;
            oldCool = newCool;
        }
        return oldSell;
    }
}