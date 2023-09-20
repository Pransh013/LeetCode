class Solution {
    public int[] sortedSquares(int[] nums) {
        int idx = nums.length - 1;
        
        int[] ans = new int[idx + 1];
        
        int i = 0, j = idx;
        
        while(i <= j) {
            if(Math.abs(nums[j]) >= Math.abs(nums[i])) {
                ans[idx--] = nums[j] * nums[j];
                j--;
            } else {
                ans[idx--] = nums[i] * nums[i];
                i++;
            }
        }
        return ans;
    }
}
