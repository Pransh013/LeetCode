class Solution {
    public boolean validPalindrome(String s) {
        
        int i = 0, j = s.length() - 1, cnt = 0;
        
        while(i <= j) {
           if(s.charAt(i) == s.charAt(j)) {
               i++;
               j--;
           } else {
               cnt++;
               j--;                                               // discarding character from end
           }
        }
        if(cnt == 1 || cnt == 0) return true;
        
        cnt = 0;
        i = 0;
        j = s.length() - 1;
        while(i <= j) {
           if(s.charAt(i) == s.charAt(j)) {
               i++;
               j--;
           } else {
               cnt++;
               i++;                                             // discarding character from start
           }
        }
        if(cnt == 1) return true;
        
        return false;
    }
}