class Solution {
    public boolean isPalindrome(int n) {
        if(n < 0) 
            return false;
        
        long y = 0;
        long temp = n;
        while(temp != 0){
            long dig = temp % 10;
            y +=dig;
            y *= 10;
            temp /= 10;
        }
        
        y /= 10;
        
        if(n == y)
            return true;
        else
            return false;
        
    }
}