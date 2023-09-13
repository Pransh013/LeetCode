class Solution {
    public String reverseOnlyLetters(String str) {
        
        StringBuilder sb = new StringBuilder(str);
        
        int s = 0, e = str.length() - 1;
        
        while(s < e) {
            char chL = sb.charAt(s);
            char chR = sb.charAt(e);
            if(Character.isLetter(chL) && Character.isLetter(chR)) {
                sb.setCharAt(s++, chR);
                sb.setCharAt(e--, chL);
            } else if(!Character.isLetter(chL))
                s++;
            else 
                e--;
        }
        return sb.toString();
    }
}