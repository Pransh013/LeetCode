class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int[] prev = new int[nums.length];
        int[] next = new int[nums.length];
        
        prev[0] = nums[0];
        next[nums.length - 1] = nums[nums.length - 1];
        
        for(int i = 1; i < nums.length; i++) {
            prev[i] = (prev[i - 1] < nums[i]) ? prev[i - 1] : nums[i];
        }
        
        for(int i = nums.length - 2; i >= 0; i--) {
            next[i] = (next[i + 1] > nums[i]) ? next[i + 1] : nums[i];
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > prev[i] && nums[i] < next[i]) return true;
        }
        
        return false;
    }
}