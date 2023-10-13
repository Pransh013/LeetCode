class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int val : nums) 
            map.put(val, map.getOrDefault(val, 0) + 1);
        
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        for(int key : map.keySet()) {
            pq.add(key);
            
            if(pq.size() > k) pq.poll();
        }
        int[] temp = new int[k];
        for(int i = 0; i < k; i++) temp[i] = pq.remove();
        return temp;
    }
}