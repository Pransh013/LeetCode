class Solution {
    public int numJewelsInStones(String J, String S) {
        int cnt = 0;
        for(char ch : S.toCharArray()) {
            if(J.indexOf(ch) > -1)
                cnt++;
        }

        return cnt;
    }
}