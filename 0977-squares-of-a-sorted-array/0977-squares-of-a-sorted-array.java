class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length - 1;
        int[] temp = new int[n + 1];
        int i = 0, j = n;
        
        while(i <= j) {
            if(Math.abs(nums[j]) >= Math.abs(nums[i]))
                temp[n--] = nums[j] * nums[j--];
            else temp[n--] = nums[i] * nums[i++];
        }
        return temp;
    }
}
