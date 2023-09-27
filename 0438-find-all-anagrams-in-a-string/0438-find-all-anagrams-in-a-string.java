class Solution {
    public List<Integer> findAnagrams(String txt, String pat) {
        List<Integer> al = new ArrayList<>();
        
        int k = pat.length(), n = txt.length(), cnt = 0;
        if(n < k) return al;
        int[] patMap = new int[26], txtMap = new int[26];
        
        for(int i = 0; i < k; i++) {
            patMap[pat.charAt(i) - 'a']++;
            txtMap[txt.charAt(i) - 'a']++;
        }
        if(isAnagram(patMap, txtMap)) al.add(0);
        
        for(int i = 0, j = k; j < n; j++) {
            txtMap[txt.charAt(j) - 'a']++;
            txtMap[txt.charAt(i) - 'a']--;
            if(isAnagram(patMap, txtMap)) al.add(i + 1);
            i++;
        }
        return al;
    }
    
    private boolean isAnagram(int[] map1, int[] map2) {
        for(int i = 0; i < 26; i++) {
            if(map1[i] != map2[i])
                return false;
        }
        return true;
    }
}