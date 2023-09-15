class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length, ans = 0;
        
        for(int i=0; i<n; i++) {
            ans ^= nums[i];               //     a ^ a = 0, a ^ 0 = a; 
        }
        return ans;
    }
}