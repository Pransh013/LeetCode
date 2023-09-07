class Solution {
    public int numJewelsInStones(String str1, String str2) {
        int cnt = 0;
        int[] freqMap = new int[123];
        for(int i=0; i<str2.length(); i++) {
            freqMap[str2.charAt(i)]++;
        }
        
        for(int i=0; i<str1.length(); i++) {
            cnt += freqMap[str1.charAt(i)];
        }
        return cnt;
    }
}