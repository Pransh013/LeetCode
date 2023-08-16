class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0; 
        int n = nums.length;
        for(int i=0; i<n-2; i++) {
            int cnt = 0;
            for(int j=i+1; j<n; j++) {
                    if(nums[j] - nums[i] == diff || nums[j] - nums[i] == 2*diff)
                        cnt++;
            }
            if(cnt >= 2)
                ans++;
        }
        
        return ans;
    }
}