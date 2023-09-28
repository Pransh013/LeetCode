class Solution {
    public int countGoodSubstrings(String s) {
        int[] freqMap = new int[26];
        int cnt = 0;
        for(int i = 0, j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if(j < 2)
                freqMap[ch - 'a']++;
            if(j - i + 1 == 3) {
                freqMap[ch - 'a']++;
                if(isUnique(freqMap)) cnt++;
                freqMap[s.charAt(i++) - 'a']--;
            }
        }
        return cnt;
    }
    private boolean isUnique(int[] map) {
        for(int val : map) {
            if(val > 1) return false;
        }
        return true;
    }
}