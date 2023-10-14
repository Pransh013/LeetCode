class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int val : nums) map.put(val, map.getOrDefault(val, 0) + 1);
        
        int[] ans = new int[k];
        
        while(k-- > 0) {
            int freq = Integer.MIN_VALUE;
            int val = 0;
            for(int key : map.keySet()) {
                if(map.get(key) > freq) {
                    val = key;
                    freq = map.get(key);
                }
            }
            ans[k] = val;
            map.put(val, 0);
        }
        return ans;
    }
}
