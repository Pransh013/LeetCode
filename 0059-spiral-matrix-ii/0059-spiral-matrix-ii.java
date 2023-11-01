class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] a = new int[n][n];
        
        int tb = 0, bb = n - 1, lb = 0, rb = n - 1, num = 1;
        
        while(num <= n * n) {
            for(int r = tb, c = lb; c <= rb && num <= n * n; c++) {
                a[r][c] = num++;
            }
            tb++;
            
            for(int c = rb, r = tb; r <= bb && num <= n * n; r++) {
                a[r][c] = num++;
            }
            rb--;
            
            for(int r = bb, c = rb; c >= lb && num <= n * n; c--) {
                a[r][c] = num++;
            }
            bb--;
            
            for(int c = lb, r = bb; r >= tb && num <= n * n; r--) {
                a[r][c] = num++;
            }
            lb++;
        }
        return a;
    }
}