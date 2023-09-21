class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> ans = new ArrayList();
       
        int[] freqMap = new int[26];
        
        Arrays.fill(freqMap, Integer.MAX_VALUE);
        
        for(String word : words) {
            int[] minFreq = new int[26];
            
            for(char ch : word.toCharArray())
                minFreq[ch - 'a']++;
            
            for(int i=0; i<26; i++) {
                freqMap[i] = Math.min(freqMap[i], minFreq[i]);
            }
        }
        
        for(int i=0; i<26; i++) {
            while(freqMap[i]-- > 0) {
                char ch = (char)(i + 'a');
                ans.add(String.valueOf(ch));
            }
        }
        return ans;
    }
}