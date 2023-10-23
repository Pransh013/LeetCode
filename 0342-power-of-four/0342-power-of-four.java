class Solution {
    public boolean isPowerOfFour(int n) {
        return check(n);
    }
    private boolean check(int n) {
        if(n == 1) return true;
        if(n % 4 != 0) return false; 
        if(n < 4) return false;
        return check(n / 4);
    }
}