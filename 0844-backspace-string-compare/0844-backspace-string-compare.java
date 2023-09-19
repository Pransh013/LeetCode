class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int n = s.length(), m = t.length();
        if(n == 1 && m == 1)
            return s.equals(t);
        
        String S = "";
        String T = "";
        int cnt = 0;
        for(int i=n-1; i>= 0; i--) {
            char ch = s.charAt(i);
            if(ch == '#')
                cnt++;
            else if(ch != '#' && cnt > 0)
                cnt--;
            else
                S = ch + S;
        }
        
        cnt = 0;
        for(int i=m-1; i>= 0; i--) {
            char ch = t.charAt(i);
            if(ch == '#')
                cnt++;
            else if(ch != '#' && cnt > 0)
                cnt--;
            else
                T = ch + T;
        }
        
        return S.equals(T);
    }
}