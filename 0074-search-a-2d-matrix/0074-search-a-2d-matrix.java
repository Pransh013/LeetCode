class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int c = mat[0].length;
        for(int[] rows : mat) {
            if(rows[0] <= target && rows[c-1] >= target) {
                int low = 0, high = c-1;
                
                while(low <= high) {
                    int mid = low + ((high - low) / 2);
                    
                    if(rows[mid] == target)
                        return true;
                    
                    if(rows[mid] > target)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }
            
        return false;
    }
}