class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int i = 0, j = 0;
        
        for(int val : nums) {
            if(val == 0) i++;
            else if(val == 1) j++;
        }
        
        for(int idx = 0; idx < n; idx++) {
            if(idx < i) nums[idx] = 0;
            else if(idx < i + j) nums[idx] = 1;
            else nums[idx] = 2;
        }
    }
}