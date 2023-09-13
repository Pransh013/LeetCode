class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        int n = nums.length;
        int start = -1, end = -1;
        
        for(int i=0; i<n; i++) {
            if(nums[i] == target) {
                if(start == -1)
                    start = i;
                
                end = i;
            }
        }
        
        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }
}