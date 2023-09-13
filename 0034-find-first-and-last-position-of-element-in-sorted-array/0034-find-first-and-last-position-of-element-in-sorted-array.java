class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        int n = nums.length;
        int start = -1, end = -1;
        int l = 0, h = n-1;
        
        while(l <= h) {
            int mid = (l + h) / 2;
            if(nums[mid] == target) {
                start = mid;
                h = mid - 1;
            } else if(nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        l = 0;
        h = n-1;
        
        while(l <= h) {
            int mid = (l + h) / 2;
            if(nums[mid] == target) {
                end = mid;
                l = mid + 1;
            } else if(nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }
}