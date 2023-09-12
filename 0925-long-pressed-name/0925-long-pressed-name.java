class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int l1 = name.length(), l2 = typed.length();
        if((l2 < l1) || (name.charAt(l1 - 1) != typed.charAt(l2 - 1)) || (name.charAt(0) != typed.charAt(0)))
            return false;
        
        int i=0, j=0;
        char prev = ' ';
        while(i < l1 && j < l2) {
            char curr = name.charAt(i);
            
            if(typed.charAt(j) == curr) {
                prev = curr;
                i++;
                j++;
            } else {
                if(typed.charAt(j) == prev)
                    j++;
                else 
                    return false;
            }
        }
        while(j < l2) {
            if(typed.charAt(j) != typed.charAt(j-1))
                return false;
            j++;
        }
        return i == l1;
    }
}