class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        if(n == 1) return false;
        
        int idx = 1;
        while(idx < n) {
            if(nums[idx] == nums[idx-1])
                return true;
            idx++;
        }
        return false;
    }
}