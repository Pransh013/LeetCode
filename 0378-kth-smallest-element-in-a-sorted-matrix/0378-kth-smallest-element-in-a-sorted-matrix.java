class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] rows : matrix) 
            for(int val : rows) {
                pq.add(val);
                if(pq.size() > k) pq.remove();
            }   
        return pq.remove();
    }
}