class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1)
            return s;
        
        String ans = "";
        int maxLen = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                String t = s.substring(i, j);
                if(t.length() > maxLen && isPalindrome(t)) {
                    maxLen = t.length();
                    ans = t;
                }
            }
        }
        return ans;
    }
    public boolean isPalindrome(String str) {
        int s=0, e=str.length()-1;  
        while(s < e) {
            if(str.charAt(s) != str.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}