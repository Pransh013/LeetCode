class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        
        int num = 0;
        boolean neg = false;
        int i = 0;
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(i == 0 ) {
                if(ch == '-') {
                    neg = true;
                    i++;
                    continue;
                } else if(ch == '+') {
                    i++;
                    continue;
                }
            }
            if(ch >= '0' && ch <= '9') {
                int dig = ch - '0';
                if(!neg) {
                    if(num > Integer.MAX_VALUE / 10 || num == Integer.MAX_VALUE / 10 && dig > 7)
                        return Integer.MAX_VALUE;
                } else {
                    int negNum = -num;
                    if(negNum < Integer.MIN_VALUE / 10 || negNum == Integer.MIN_VALUE / 10 && dig > 8)
                        return Integer.MIN_VALUE;
                }
                num = num * 10 + dig;
            } else break;
            i++;
        }
        return (neg) ? -num : num;
    }
}