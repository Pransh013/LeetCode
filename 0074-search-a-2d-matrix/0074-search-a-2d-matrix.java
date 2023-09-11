class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        for(int[] rows : mat) 
            for(int val : rows) 
                if(val == target)
                    return true;
            
        return false;
    }
}