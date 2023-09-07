class Solution {
    public int numJewelsInStones(String str1, String str2) {
        int cnt = 0;
        for(int i=0; i<str1.length(); i++) {
            char chJ = str1.charAt(i);
            for(int j=0; j<str2.length(); j++) {
                char chS = str2.charAt(j);
                if(chJ == chS)
                    cnt++;
            }
        }
        return cnt;
    }
}