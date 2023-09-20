class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        int[] ans = new int[n];
        int idx = n - 1;
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
