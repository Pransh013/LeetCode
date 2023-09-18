class Solution {
    public boolean isPalindrome(int n) {
        
        if(n == 0) return true;
        if(n < 0 || n % 10 == 0) return false;
        
        int rev = 0;
        int temp = n;
        while(temp > 0){
            int dig = temp % 10;
            rev = rev*10 + dig;
            temp /= 10;
        }
        return n == rev;
    }
}