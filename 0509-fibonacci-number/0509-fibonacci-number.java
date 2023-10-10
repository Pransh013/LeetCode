class Solution {
    public int fib(int n) {
        return getFib(n);
    }
    private int getFib(int n) {
        if(n == 0 || n == 1) return n;
        return getFib(n-1) + getFib(n - 2);
    }
}