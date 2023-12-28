class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        char[] temp = s.toCharArray();
        long total = 0, cnt = 0;
        int j = n -1;
        
        while(j >= 0) {
            if(temp[j] == '0') cnt++;
            else total += cnt;
            j--;
        }
        return total;
    }
}