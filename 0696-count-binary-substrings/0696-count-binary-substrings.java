class Solution {
    public int countBinarySubstrings(String s) {
        
        int n = s.length();
        
        int[] arr = new int[n];
        int cnt = 1, bt = 0;
        for(int i=1; i<n; i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                cnt++;
            } else {
                arr[bt++] = cnt;
                cnt = 1;
            }
        }
        
        arr[bt] = cnt;
        
        int sum = 0;
        for(int i=1; i<=bt; i++) {
            sum += Math.min(arr[i], arr[i-1]);
        }
        return sum;
    }
}