class Solution {
    public String reverseWords(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                st.push(ch);
                flag = true;
            } else {
                if(flag) {
                    while(!st.isEmpty()) {
                        sb.append(st.pop());
                    }
                    sb.append(" ");
                    flag = false;
                }
            }
        }
        
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.toString().trim();
    }
}