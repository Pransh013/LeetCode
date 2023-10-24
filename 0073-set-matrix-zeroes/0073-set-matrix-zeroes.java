class Solution {
    public void setZeroes(int[][] a) {
        int n = a.length, m = a[0].length;
        int[][] b= new int[n][m];
        
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                if(a[r][c] == 0) {
                    fillRow(b, r);
                    fillCol(b, c);
                }
            }
        }
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                if(b[r][c] == 1) {
                    a[r][c] = 0;
                }
            }
        }
    }
    
    private void fillRow(int[][] a, int r) {
        for(int c = 0; c < a[0].length; c++) a[r][c] = 1;
    }
    
    private void fillCol(int[][] a, int c) {
        for(int r = 0; r < a.length; r++) a[r][c] = 1;
    }
}