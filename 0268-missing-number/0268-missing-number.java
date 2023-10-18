class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
//      Cyclic Sort
        for(int i = 0; i < n;) {
            if(nums[i] < n && nums[i] != nums[nums[i]]) swap(nums, i, nums[i]);
            else i++;
        }
        
        for(int i = 0; i < n; i++)
            if(nums[i] != i) return i;
        
        return n;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}