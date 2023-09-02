class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        int k = arr.length;
        if(m * n != k)
            return new int[0][0];
        
        int[][] ans = new int[m][n];
        
        int idx = 0;
        for(int r=0; r<m; r++) {
            for(int c=0; c<n; c++) {
                if(idx < k) {
                    ans[r][c] = arr[idx];
                    idx++;
                }
            }
        }
        return ans;
    }
}