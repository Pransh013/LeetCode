class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(nums[i] < ans)
                ans = nums[i];
        }
        return ans;
    }
}