class Solution {
    public boolean searchMatrix(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        
        int low = 0, high = n * m - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m, col = mid % m;
            if(mat[row][col] == k) return true;
            else if(mat[row][col] < k) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}