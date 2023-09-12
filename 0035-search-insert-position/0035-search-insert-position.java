class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, h=nums.length;
        
        while(l < h) {
            int mid = (l + h) / 2;
            if(nums[mid] < target)
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }
}