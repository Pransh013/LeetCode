class Solution {
    public boolean isPalindrome(String str) {
        if(str.isEmpty()) return true;
        str = str.toLowerCase();
        
        int i = 0, j = str.length() - 1;
        while(i <= j) {
            char s = str.charAt(i);
            char p = str.charAt(j);
            
            if(!Character.isLetterOrDigit(s)) i++;
            
            else if(!Character.isLetterOrDigit(p)) j--;
            
            else if(s == p) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }
}