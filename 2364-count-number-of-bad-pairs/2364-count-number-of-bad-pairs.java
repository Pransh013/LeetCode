class Solution {
    public long countBadPairs(int[] nums) {
        long ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j = 0; j < nums.length; j++) {
            int val = nums[j] - j;
            ans += j - map.getOrDefault(val, 0);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return ans;
    }
}