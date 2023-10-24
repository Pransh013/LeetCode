class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0, ans = 0;
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                if(cnt > 0)
                    ans = cnt;
                cnt = 0;
            } else cnt++;
        }
        if(cnt > 0)
            ans = cnt;
        return ans;
    }
}