class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        
        for(int val : nums) {
            if(val <= f) {
                f = val;
            } else if(val <= s) {
                s = val;
            } else return true;
        }
        return false;
    }
}