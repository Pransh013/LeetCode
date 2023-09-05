class Solution {
    public boolean isPalindrome(String str) {
        
        if (str.isEmpty()) {
            return true;
        }

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            char chL = str.charAt(i);
            char chR = str.charAt(j);
    
            if (!Character.isLetterOrDigit(chL)) {
                i++;
            } else if (!Character.isLetterOrDigit(chR)) {
                j--;
            } else {
                if (Character.toLowerCase(chL) != Character.toLowerCase(chR)) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}