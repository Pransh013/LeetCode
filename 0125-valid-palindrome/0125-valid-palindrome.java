class Solution {
    public boolean isPalindrome(String str) {
        
        if (str.isEmpty()) {
            return true;
        }

        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(isAlphaNumeric(ch)) sb.append(ch);
        }
        
        str = sb.toString();
        
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            char chL = str.charAt(i);
            char chR = str.charAt(j);
            if (chL != chR) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public boolean isAlphaNumeric(char ch) {
        if(ch >= 'a' && ch <= 'z') return true;
        if(ch >= '0' && ch <= '9') return true;
        return false;
    }
}