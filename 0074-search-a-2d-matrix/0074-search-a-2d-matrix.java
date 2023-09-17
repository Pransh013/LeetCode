class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int r = mat.length;
        int c = mat[0].length;
        
        int low = 0, high = r*c - 1;
                
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            
            int i = mid / c, j = mid % c;
            if(mat[i][j] == target)
                return true;

            if(mat[i][j] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
            
        return false;
    }
}