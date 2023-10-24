class Solution {
    public void setZeroes(int[][] a) {
        int n = a.length, m = a[0].length;
        
        int col = 1;
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                if(a[r][c] == 0) {
                    if(c == 0) col = 0;
                    else {
                        a[r][0] = 0;
                        a[0][c] = 0;
                    }
                }
            }
        }
        for(int r = n - 1; r > 0; r--) {
            for(int c = m - 1; c > 0; c--) {
                if(a[r][0] == 0 || a[0][c] == 0) a[r][c] = 0;
            }
        }
        if(a[0][0] == 0) {
            for(int c = 1; c < m; c++) a[0][c] = 0;
        }
        if(col == 0) {
            for(int r = 0; r < n; r++) a[r][0] = 0;
        }
    }
}