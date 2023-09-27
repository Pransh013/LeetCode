class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int maxLen = 0;
        for(int i = 0, j = 0; i < s.length();) {
            char ch = s.charAt(i);
            while(set.contains(ch)) set.remove(s.charAt(j++));
            set.add(ch);
            i++;
            maxLen = Math.max(maxLen, (i - j));
        }
        return maxLen;
    }
}