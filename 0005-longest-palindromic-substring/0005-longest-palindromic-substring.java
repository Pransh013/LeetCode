class Solution {
    public String longestPalindrome(String s) {
        String sb = "";
       
        // odd length
        for(int ax = 0; ax < s.length(); ax++) {
            int d = 1, len = 1;
            
            while(ax - d >= 0 && ax + d < s.length()) {
                if(s.charAt(ax - d) == s.charAt(ax + d)) {
                    len += 2;
                    d++;
                } else break;
            }
            
            if(len > sb.length()) {
                int x = ax - len / 2;
                sb = s.substring(x, x + len);
            }
        }
        
        // even length
        for(int ax = 0; ax < s.length() - 1; ax++) {
            int d = 1, len = 0;
            
            while(ax - d + 1 >= 0 && ax + d < s.length()) {
                if(s.charAt(ax - d + 1) == s.charAt(ax + d)) {
                    len += 2;
                    d++;
                } else break;
            }
            
            if(len > sb.length()) {
                int x = ax - len / 2 + 1;
                sb = s.substring(x, x + len);
            }
        }
        return sb;
    }    
}