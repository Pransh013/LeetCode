class Solution {
    public int mySqrt(int n) {
        if(n <= 1)
            return n;
        
        int s = 0, e = n, ans = -1;
        
        while(s <= e) {
            int m = s + ((e - s) / 2);
            if((long)m * m <= (long)n) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}