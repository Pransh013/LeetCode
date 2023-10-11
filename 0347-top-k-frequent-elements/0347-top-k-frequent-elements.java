class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int val : nums) map.put(val, map.getOrDefault(val, 0) + 1);
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        for(int key : map.keySet()) {
            pq.add(key);
            if(pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        int idx = 0;
        while(!pq.isEmpty()) res[idx++] = pq.poll();
        return res;
    }
}