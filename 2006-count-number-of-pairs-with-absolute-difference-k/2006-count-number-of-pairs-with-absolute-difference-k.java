class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int j = 0; j < nums.length; j++) {
            if(map.containsKey(nums[j] + k))
                ans += map.get(nums[j] + k);
            if(map.containsKey(nums[j] - k))
                ans += map.get(nums[j] - k);
            
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
        }
        return ans;
    }
}