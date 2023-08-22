class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqMap = new int[26];
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freqMap[idx]++;
        }
        
        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            int idx = ch - 'a';
            freqMap[idx]--;
        }
        
        for(int i=0; i<26; i++) {
            if(freqMap[i] != 0)
                return false;
        }
        return true;
    }
}