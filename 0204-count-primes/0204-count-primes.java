class Solution {
    public int countPrimes(int n) {
        if(n < 2) return 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < isPrime.length; i++) {
            if(isPrime[i]) cnt++;
        }
        return isPrime[n] ? cnt - 1 : cnt;
    }
}