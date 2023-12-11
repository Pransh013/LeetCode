class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0, l = flowerbed.length;
        
        if(n == 0) return true;
        if(l == 1) {
            if(n == 1 && flowerbed[0] == 0) return true;
            return false;
        } 
        
        if(l == 2 && n > 1) return false;
        if(l == 2 && flowerbed[0] == 0 && flowerbed[1] == 0) return true;
        
        if(l > 2) {
            if(flowerbed[0] == 0 && flowerbed[1] == 0) {
            cnt++;
            flowerbed[0] = 1;
            }

            if(flowerbed[l - 1] == 0 && flowerbed[l - 2] == 0) {
                cnt++;
                flowerbed[l - 1] = 1;
            }

            int i = 1;
            while(i < l - 1) {
                if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    cnt++;
                    flowerbed[i] = 1;
                }
                i++;
            }
        }
        return cnt >= n;
    }
}