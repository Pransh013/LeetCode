class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String sb = "";
        int maxLen = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= n; j++) {
                String ss = s.substring(i, j);
                if(ss.length() > maxLen && isPalindrome(ss)) {
                    sb = ss;
                    maxLen = sb.length();
                } 
            }
        }
        return sb.toString();
    }
    
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }    
}