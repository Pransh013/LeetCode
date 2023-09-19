class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return reformed(s).equals(reformed(t));
    }
    private String reformed(String str) {
        Stack<Character> st = new Stack();
        for(char ch : str.toCharArray()) {
            if(ch != '#')
                st.push(ch);
            else if(!st.empty())
                st.pop();
        }
        return String.valueOf(st);
    }
}