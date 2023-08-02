class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        int num1 = 0;
        int num0 = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                int j = i;
                num1 = 0;
                while(j<s.length() && s.charAt(j) == '1') {
                    j++;
                    num1++;
                }
                i = j-1;
                System.out.println(num1 + " " + num0);
                ans = Math.max(ans, Math.min(num1, num0)*2);
            } else {
                int j = i;
                num0 = 0;
                while(j<s.length() && s.charAt(j) == '0') {
                    j++;
                    num0++;
                }
                    i = j-1;
            }
        }
        return ans;
    }
}