class Solution {
    public boolean checkOnesSegment(String s) {
        int ind = -1;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                if(ind != -1 && i-ind >1)
                    return false;
                ind = i;
            }
        }
        return true;
    }
}