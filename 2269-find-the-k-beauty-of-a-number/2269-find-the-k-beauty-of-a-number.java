class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder s = new StringBuilder("" + num);
        int cnt = 0;
        for(int j = 0; j <= s.length() - k; j++) {
            int n = Integer.valueOf(s.substring(j, j+k));
            if(n != 0 && num % n == 0) cnt++;
        }
        return cnt;
    }
}