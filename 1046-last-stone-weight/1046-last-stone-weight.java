class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < stones.length; i++) pq.add(stones[i]);
        while(pq.size() > 1) {
            int max = pq.remove(), secMax = pq.remove();
            if((max - secMax) > 0) pq.add(max - secMax);
        }
        return (pq.isEmpty() ? 0 : pq.remove());
    }
}