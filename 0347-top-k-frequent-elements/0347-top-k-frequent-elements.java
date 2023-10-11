class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>[] bucket = new ArrayList[n + 1];
        
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int i = 0; i <= n; i++) bucket[i] = new ArrayList<>();
        
        for(int key : map.keySet()) {
            bucket[map.get(key)].add(key);
        }
        int[] result = new int[k];
        int idx = 0;
        
        for(int i = n; i >= 0; i--) {
            if(bucket[i].isEmpty()) continue;
            else
                for(int val : bucket[i]) {
                    if(idx < k)
                        result[idx++] = (val);
                }
            if(idx >= k) break;
        } 
        return result;
    }
}