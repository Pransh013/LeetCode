class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if(n == 0 || n == 1)
            return n;
        else if(n >=2) {
            for(int i=2; i<=n; i++) {
                c = a+b;
                a = b;
                b = c;
        }
        }
        return  c;
    }
}