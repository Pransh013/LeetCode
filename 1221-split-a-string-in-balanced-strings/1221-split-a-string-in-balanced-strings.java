class Solution {
    public int balancedStringSplit(String s) {
        
        int n = s.length();
        int cnt = 0;
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'L') cnt--;
            if(s.charAt(i) == 'R') cnt++;
            
            if(cnt == 0) ans++;
        }
        return ans;
    }
}