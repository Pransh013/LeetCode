class Solution {
    public boolean isLongPressedName(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        if((l2 < l1) || (s1.charAt(l1 - 1) != s2.charAt(l2 - 1)) || (s1.charAt(0) != s2.charAt(0)))
            return false;
        
        int i=0, j=0;
        
        while(i < l1) {
            if(j == l2)
                return false;
            char curr = s1.charAt(i);
            
            if(s2.charAt(j) == curr) {
                i++;
                j++;
            } else {
                if(s2.charAt(j) == s2.charAt(j-1))
                    j++;
                else 
                    return false;
            }
        }
        while(j != l2) {
            if(s2.charAt(j) != s2.charAt(j-1))
                return false;
            j++;
        }
        return true;
    }
}