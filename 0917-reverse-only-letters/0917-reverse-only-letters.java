class Solution {
    public String reverseOnlyLetters(String str) {
        
        char[] temp = str.toCharArray();
        
        int n = temp.length;
        int s = 0, e = n - 1;
        
        while(s < e) {
            char chL = temp[s];
            char chR = temp[e];
            if(Character.isLetter(chL) && Character.isLetter(chR)) {
                char ch = temp[s];
                temp[s] = temp[e];
                temp[e] = ch;
                s++;
                e--;
            } else if(!Character.isLetter(chL)) {
                s++;
            } else {
                e--;
            }
        }
        
        return String.valueOf(temp);
    }
}