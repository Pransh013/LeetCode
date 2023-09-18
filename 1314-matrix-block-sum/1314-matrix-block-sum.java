class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int[] rows : mat) 
            for(int j=1; j<m; j++)
                rows[j] += rows[j-1];
        
        for(int j=0; j<m; j++)
            for(int i=1; i<n; i++)
                mat[i][j] += mat[i-1][j];
        
        int[][] ans = new int[n][m];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int r1 = Math.max(0, i-k);
                int r2 = Math.min(n-1, i+k);
                
                int c1 = Math.max(0, j-k);
                int c2 = Math.min(m-1, j+k);
                
                ans[i][j] = calculateSum(r1, c1, r2, c2, mat);
            }
        }
        return ans;
    }
    public int calculateSum(int r1, int c1, int r2, int c2, int[][] mat) {
        if(r1 == 0 && c1 == 0) return mat[r2][c2];
        if(r1 == 0) return mat[r2][c2] - mat[r2][c1-1];
        if(c1 == 0) return mat[r2][c2] - mat[r1-1][c2];
        return mat[r2][c2] - mat[r2][c1-1] - mat[r1-1][c2] + mat[r1-1][c1-1];
    }
}