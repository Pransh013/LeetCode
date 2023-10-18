class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n;) {
            if(nums[i] > 0 && nums[i] < n) {
                if(nums[i] != nums[nums[i] - 1]) swap(nums, i, nums[i] - 1);
                else i++;
            } else i++;
        }
        
        for(int i = 0; i < n; i++) 
            if(nums[i] != i + 1) return (i + 1);
        
        return (nums[n - 1] + 1);
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}