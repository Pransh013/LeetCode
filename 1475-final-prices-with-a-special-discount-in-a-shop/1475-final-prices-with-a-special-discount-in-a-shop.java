class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && prices[i] <= prices[st.peek()]) {
                prices[st.pop()] -= prices[i];
            }
            st.push(i);
        }
        return prices;
    }
}