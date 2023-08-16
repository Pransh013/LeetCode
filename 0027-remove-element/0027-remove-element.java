class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i=0; 
        int j = n-1;
        
        while(i<=j) {
            if(nums[i] == val) {
                swap(nums, i, j);
                j--;
            } else {
                i++;
            }
        }
        return i;
    }
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}