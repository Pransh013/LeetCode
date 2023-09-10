class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        
        int minRow = 0, maxRow = n-1, minCol = 0, maxCol = n-1, cnt = 1; 
        
        while(cnt <= n*n) {
            
    //         Upper Wall
            for(int r=minRow, c=minCol; c<=maxCol && cnt <= n*n; c++) {
                arr[r][c] = cnt++;
            }
            minRow++;

    //         Right Wall
            for(int r=minRow, c=maxCol; r<=maxRow && cnt <= n*n; r++) {
                arr[r][c] = cnt++;
            }
            maxCol--;

    //         Bottom Wall
            for(int r=maxRow, c=maxCol; c>=minCol && cnt <= n*n; c--) {
                arr[r][c] = cnt++;
            }
            maxRow--;

    //         Left Wall
            for(int r=maxRow, c=minCol; r>=minRow && cnt <= n*n; r--) {
                arr[r][c] = cnt++;
            }
            minCol++;
        }
        return arr;
    }
}