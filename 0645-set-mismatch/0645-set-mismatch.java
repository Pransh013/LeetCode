class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n;) {
            if(nums[nums[i] - 1] != nums[i]) swap(nums, i, nums[i] - 1);
            else i++;
        }
        
        for(int i = 0; i < n; i++) {
            if(nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }
        return new int[0];
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}