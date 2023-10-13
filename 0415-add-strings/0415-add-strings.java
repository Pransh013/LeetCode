class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, c = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i >= 0 || j >= 0 || c > 0) {
            int dig1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int dig2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            
            int sum = dig1 + dig2 + c;
            
            int res = sum % 10;
            c = sum / 10;
            
            sb.append(res);
            i--;
            j--;
            
        }
        return sb.reverse().toString();
    }
}