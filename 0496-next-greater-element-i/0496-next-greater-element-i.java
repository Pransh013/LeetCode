class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < nums2.length; i++) {
            while(st.size() > 0 && nums2[i] > nums2[st.peek()]) {
                nums2[st.pop()] = nums2[i];
            }
            st.push(i);
        }
        
        while(st.size() > 0) nums2[st.pop()] = -1;
        
        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = nums2[map.get(nums1[i])];
        }
        return nums1;
    }
}