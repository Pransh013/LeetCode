class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(set.contains(ch)) {
                    maxLen = Math.max(maxLen, set.size());
                    break;
                }
                set.add(ch);
            }
            maxLen = Math.max(maxLen, set.size());
        }
        return maxLen;
    }
}