class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0, cnt = 0;
        for(int i = 0, j = 0; j < s.length(); j++) {
            char cj = s.charAt(j);
            if(j - i + 1 < k) {
                if(isVowel(cj)) cnt++;
                continue;
            }
            
            if(isVowel(cj)) cnt++;
            if(cnt > ans) ans = cnt;
            char ci = s.charAt(i);
            if(isVowel(ci)) cnt--;
            i++;
        }
        return ans;
    }
    
    private boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}