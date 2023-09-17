class Solution {
    public boolean searchMatrix(int[][] mat, int k) {
        int c = mat[0].length;
        for(int[] rows : mat) {
            if(rows[0] <= k && rows[c-1] >= k) {
                int low = 0, high = c-1;
                
                while(low <= high) {
                    int mid = low + ((high - low) / 2);
                    
                    if(rows[mid] == k)
                        return true;
                    
                    if(rows[mid] > k)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }
            
        return false;
    }
}