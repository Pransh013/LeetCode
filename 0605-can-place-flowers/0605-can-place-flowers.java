class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0, l = flowerbed.length;
        
        for(int i = 0; i < l; i++) {
            int next = (i == l - 1) ? 0 : flowerbed[i + 1];
            int prev = (i == 0) ? 0 : flowerbed[i - 1];
            
            if(flowerbed[i] == 0 && prev + next == 0) {
                flowerbed[i] = 1;
                cnt++;
            }
        }
        return cnt >= n;
    }
}