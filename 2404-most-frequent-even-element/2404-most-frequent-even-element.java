class Solution {
    public int mostFrequentEven(int[] nums) {
        int prev = -1, num = -1;
        for(int i : nums) {
            if((i & 1) == 0) {
                int cnt = 0;
                for(int j : nums) {
                    if(j == i) cnt++;
                }
                if(cnt > prev) {
                    num = i;
                    prev = cnt;
                }
                else if(cnt == prev && i < num) {
                    num = i;
                    prev = cnt;
                }
            }
        }
        return num;
    }
}