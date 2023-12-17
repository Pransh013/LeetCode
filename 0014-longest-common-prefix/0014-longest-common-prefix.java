class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 1) return strs[0];
        
        String ans = "";
        int i = 0;
        while(i < strs[0].length()) {
            char ch = strs[0].charAt(i);
            
            for(int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || ch != strs[j].charAt(i)) return strs[0].substring(0, i);
            }
            i++;
        }
        return strs[0].substring(0, i);
    }
}