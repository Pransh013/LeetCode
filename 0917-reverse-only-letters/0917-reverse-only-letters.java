class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : S.toCharArray())
            if (Character.isLetter(ch))
               st.push(ch);

        StringBuilder sb = new StringBuilder();
        
        for(char ch : S.toCharArray()) {
            if (Character.isLetter(ch))
               sb.append(st.pop());
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}