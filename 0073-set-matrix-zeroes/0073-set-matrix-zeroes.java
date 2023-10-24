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
        
        for(int i = 0; i < n; i++) {
            if(rows[i]) fillRow(a, i);
        }
        for(int i = 0; i < m; i++) {
            if(cols[i]) fillCol(a, i);
        }
    }
    
    private void fillRow(int[][] a, int r) {
        for(int c = 0; c < a[0].length; c++) a[r][c] = 0;
    }
    
    private void fillCol(int[][] a, int c) {
        for(int r = 0; r < a.length; r++) a[r][c] = 0;
    }
}