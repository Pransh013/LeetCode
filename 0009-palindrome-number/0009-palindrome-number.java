class Solution {
    public boolean isPalindrome(int n) {
        
        if(n == 0) return true;
        if(n < 0 || n % 10 == 0) return false;
        
        int rev = 0;
        
        while(n > rev){
            int dig = n % 10;
            rev = rev*10 + dig;
            n /= 10;
        }
        return (n == rev || n == rev / 10);
    }
}