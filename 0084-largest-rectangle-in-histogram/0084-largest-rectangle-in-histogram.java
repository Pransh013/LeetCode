class Solution {
    public int largestRectangleArea(int[] heights) {
        return getMaxArea(heights);
    }
    
    private int getMaxArea(int[] heights) {
        int[] right = nextSmallerToRight(heights);
        int[] left = nextSmallerToLeft(heights);
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++) {
            int area = (right[i] - left[i]) * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    
    private int[] nextSmallerToLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] left = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) st.pop();
            if(st.isEmpty()) left[i] = 0;
            else if(arr[st.peek()] < arr[i]) left[i] = st.peek() + 1;
            st.push(i);
        }
        return left;
    }
    
    private int[] nextSmallerToRight(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] right = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i] < arr[st.peek()]) right[st.pop()] = i;
            st.push(i);
        }
        while(!st.isEmpty()) right[st.pop()] = arr.length;
        return right;
    }
}