class Solution {
    public void setZeroes(int[][] a) {
        int n = a.length, m = a[0].length;
        
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                if(a[r][c] == 0) {
                    rows[r] = true;
                    cols[c] = true;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(rows[i] || cols[j]) a[i][j] = 0;
    }
}