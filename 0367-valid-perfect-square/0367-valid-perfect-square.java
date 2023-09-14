class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        int low = 1, high = num;
        
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            
            if((long)mid*mid == (long)num)
                return true;
            
            if((long)mid*mid > (long)num)
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return false;
    }
}