class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int i = 0, j = 1;
        while(i < nums.length) {
            if(nums[i] % 2 == 0) {
                i += 2;
            } else if(nums[j] % 2 == 1){
                j += 2;
            } else {
                swap(nums, i, j);
                i += 2;
                j += 2;
            }
        }
        return nums;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}