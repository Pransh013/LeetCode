class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n == 0) return t.charAt(0);

        int[] arr = new int[26];
        arr[t.charAt(m - 1) - 'a']++;
        int idx = 0;
        while(idx < n) {
            arr[t.charAt(idx) - 'a']++;
            arr[s.charAt(idx) - 'a']--;
            idx++;
        }
        for(int i = 0; i < 26; i++)
            if(arr[i] != 0)
                return (char)(i + 'a');
        return '-';
    }
}