class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int i = 0, j = (n - 1), k = 0;
        
        while(k <= j) {
            if(nums[k] == 0) swap(nums, i++, k++);
            else if(nums[k] == 2) swap(nums, k, j--);
            else k++;
        }
    }
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}