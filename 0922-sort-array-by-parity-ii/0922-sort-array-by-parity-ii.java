class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        
        int i = 0, j = 1;
        int idx = 0;
        while(idx < nums.length) {
            if(nums[idx] % 2 == 0) {
                arr[i] = nums[idx++];
                i += 2;
            } else {
                arr[j] = nums[idx++];
                j += 2;
            }
        }
        return arr;
    }
}