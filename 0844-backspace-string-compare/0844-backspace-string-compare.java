class Solution {
    public boolean backspaceCompare(String S, String T) {
        int S_pointer = S.length() - 1;
        int T_pointer = T.length() - 1;
        
        int S_skips = 0, T_skips = 0;
        
        while(S_pointer >= 0 || T_pointer >= 0) {
            
            S_pointer = reformed(S, S_skips, S_pointer);
            T_pointer = reformed(T, T_skips, T_pointer);  
            
            if(S_pointer >= 0 && T_pointer >= 0 && S.charAt(S_pointer) != T.charAt(T_pointer))
                return false;
            
            if((S_pointer >= 0) != (T_pointer >= 0))
                return false;
            
            S_pointer--;
            T_pointer--;
        } 
        return true;
    }
    private int reformed(String str, int skips, int pointer) {
        while(pointer >= 0) {
                if(str.charAt(pointer) == '#') {
                    skips++;
                    pointer--;
                } else if(skips > 0) {
                    pointer--;
                    skips--;
                } else {
                    return pointer;
                }
            }
        return pointer;
    }
}