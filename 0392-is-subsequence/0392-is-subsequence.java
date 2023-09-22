class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
        
        int i = s.length() - 1, j = t.length() - 1;
        
        while(i >= 0) {
            if(j < 0) {
                return false;
            } else if(s.charAt(i) == t.charAt(j)) {
                i--;
                j--;
            } else {
                j--;
            }
        }
        return true;
    }
}