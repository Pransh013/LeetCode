class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()) {
            if(st.isEmpty() || st.peek() != ch) st.push(ch);
            else st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.insert(0, st.pop());
        return sb.toString();
    }
}