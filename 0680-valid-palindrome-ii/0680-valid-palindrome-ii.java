class Solution {
    public boolean validPalindrome(String s) {
        
        int i = 0, j = s.length() - 1, cnt = 0;
        
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j))
                return(isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j));
            i++;
            j--;
        }
        
        return true;
    }
    
    private boolean isPalindrome(String s, int i, int j) {
        while(i <= j) {
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}