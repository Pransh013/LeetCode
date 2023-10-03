class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int val : nums) {
            if(map.containsKey(val)) cnt += map.get(val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return cnt;
    }
}