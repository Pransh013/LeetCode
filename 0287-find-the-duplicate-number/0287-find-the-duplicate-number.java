class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        for(int val : nums) {
            if(nums[Math.abs(val)] < 0)
                return Math.abs(val);
            
            nums[Math.abs(val)] = (-1) * nums[Math.abs(val)];
        }
        return -1;
    }
}