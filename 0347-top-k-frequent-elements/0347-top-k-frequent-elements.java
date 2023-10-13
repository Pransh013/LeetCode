class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums) map.put(val, map.getOrDefault(val, 0) + 1);
        
        ArrayList<Integer>[] bucket = new ArrayList[n + 1];
        for(int i = 0; i <= n; i++) bucket[i] = new ArrayList<>();
        for(int key : map.keySet()) {
            bucket[map.get(key)].add(key);
        }
        int[] temp = new int[k];
        int idx = 0;
        for(int i = n; i >= 0; i--) {
            if(!bucket[i].isEmpty()) {
                for(int val : bucket[i]) {
                    if(idx < k) temp[idx++] = val;
                }
            }
            if(idx == k) break;
        }
        return temp;
    }
}