class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if(n == 1 && nums[0] == 1) return 2;
        else if(n == 1) return 1;
        
        Arrays.sort(nums);
        if(nums[n - 1] <= 0) return 1;
        int idx = upperBound(nums, 0);
        int num = 1;
        
        for(int i = idx; i < n; i++) {
            if(i < n - 1 && nums[i] == nums[i + 1]) continue;
            if(nums[i] == num) num++;
            else return num;
        }
        return num;
    }
    
    private int upperBound(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}