class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        
        int n = nums.length;
        int start = n, end = n;
        
        for(int i=0; i<n; i++) {
            if(nums[i] == target) {
                if(i < start)
                    start = i;
                
                end = i;
            }
        }
        if(start == n)
            return ans;
        else {
            ans[0] = start;
            ans[1] = end;
        }
        return ans;
    }
}