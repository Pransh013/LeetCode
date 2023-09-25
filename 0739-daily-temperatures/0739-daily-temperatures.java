class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && temp[i] > temp[st.peek()]) {
            temp[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()) temp[st.pop()] = 0;
        return temp;
    }
}