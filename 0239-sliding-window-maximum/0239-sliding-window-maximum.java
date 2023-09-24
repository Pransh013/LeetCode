class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] nextGreater = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[i] > nums[st.peek()]) {
                nextGreater[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) nextGreater[st.pop()] = n;
            
        int[] res = new int[n - k + 1];
        
        for(int i = 0; i < n - k + 1; i++) {
            int j = i;
            
            while(nextGreater[j] < i + k) {
                j = nextGreater[j];
            }
            res[i] = nums[j];
        }
        return res;  
    }
}