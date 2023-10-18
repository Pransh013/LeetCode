class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n;) {
            if(nums[nums[i] - 1] != nums[i]) swap(nums, i, nums[i] - 1);
            else i++;
        }
        
        for(int i = 0; i < n; i++) {
            if(nums[i] != i + 1) list.add(i + 1);
        }
        return list;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}