class Solution {
    public boolean searchMatrix(int[][] mat, int k) {
        
        for(int[] rows : mat)
            for(int val : rows)
                if(val == k)
                    return true;
        
        return false;
    }
}