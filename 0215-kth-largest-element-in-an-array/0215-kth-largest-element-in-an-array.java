class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : nums) pq.add(val);
        int num = 0;
        while(k-- > 0) num = pq.remove();
        return num;
    }
}