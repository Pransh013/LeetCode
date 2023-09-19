class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return reformed(s).equals(reformed(t));
    }
    private String reformed(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i=n-1; i>= 0; i--) {
            char ch = str.charAt(i);
            if(ch == '#')
                cnt++;
            else if(cnt > 0)
                cnt--;
            else
                sb.insert(0, ch);
        }
        return sb.toString();
    }
}