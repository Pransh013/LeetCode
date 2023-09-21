class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i=0; i<n; i++) {
            nums[queries[i][1]] += queries[i][0];
            int sum = 0;
            for(int j=0; j<n; j++) {
                if(nums[j] % 2 == 0)
                    sum += nums[j];
            }
            res[i] = sum;
        }
        return res;
    }
}