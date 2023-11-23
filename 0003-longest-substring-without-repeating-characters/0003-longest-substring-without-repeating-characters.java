class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] set = new boolean[256];
        int maxLen = 0;
        
        int i = 0, j = 0;
        while(j < s.length()) {
            char ch = s.charAt(j);
            if(set[ch]) {
                if((j - i) > maxLen) maxLen = j - i;
                while(set[ch]) {
                    set[s.charAt(i)] = false;
                    i++;
                }
            }
            set[ch] = true;
            j++;
        }
        
        return ((j - i) < maxLen) ? maxLen : j - i;
    }
}