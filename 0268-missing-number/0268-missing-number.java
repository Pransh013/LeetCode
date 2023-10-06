class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(nums[j] == i) cnt++;
            }
            if(cnt == 0) return i;
        }
        return -1;
    }
}