class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> al = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            if(i == 0 || groups[i] != groups[i - 1])
                al.add(words[i]);  
        return al;
    }
}