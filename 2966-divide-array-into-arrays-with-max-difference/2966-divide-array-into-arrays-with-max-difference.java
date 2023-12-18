class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] a = new int[n / 3][3];
        
        Arrays.sort(nums);
        
        for(int i = 2; i < n; i += 3) {
            if(nums[i] - nums[i - 2] > k) return new int[0][0];
            
            a[i / 3][0] = nums[i - 2];
            a[i / 3][1] = nums[i - 1];
            a[i / 3][2] = nums[i];
        }
        return a;
    }
}