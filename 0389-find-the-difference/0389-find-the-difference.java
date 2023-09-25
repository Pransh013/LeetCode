class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n == 0) return t.charAt(0);
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        
        Arrays.sort(S);
        Arrays.sort(T);
        
        int idx = 0;
        while(idx < n) {
            if(S[idx] != T[idx])
                return T[idx];
            idx++;
        }
        return T[m - 1];
    }
}