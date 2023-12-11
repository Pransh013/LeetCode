class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cnt = 0, prd = 1;
        for(int val : nums) {
            if(val == 0) cnt++;
            else prd *= val;
        }
        
        if(cnt > 1) return new int[nums.length];
        
        if(cnt == 1) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) nums[i] = prd;
                else nums[i] = 0;
            }
            return nums;
        }
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = prd / nums[i];
        }
        return nums;
    }
}