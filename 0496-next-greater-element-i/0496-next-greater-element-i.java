class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        for(int i = 0; i < nums1.length; i++) {
            Stack<Integer> st = new Stack<>();
            for(int j = 0; j < nums2.length; j++) {
                st.push(nums2[j]);
            }
            int max = Integer.MIN_VALUE;
            while(st.peek() != nums1[i]) {
                if(st.peek() > nums1[i]) max = st.peek();
                st.pop();
            }
            if(max == Integer.MIN_VALUE) max = -1;
            nums1[i] = max;
        }
        return nums1;
    }
}