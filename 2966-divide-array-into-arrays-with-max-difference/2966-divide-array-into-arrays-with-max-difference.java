class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] a = new int[n / 3][3];
        
        Arrays.sort(nums);
        
        int idx = 0;
        for(int i = 0; i < n / 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = nums[idx++];
            }
            
            if(a[i][2] - a[i][0] > k) return new int[0][0];
        }
        return a;
    }
}