class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int j = i + 1, k = n - 1;
                
                while(j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == target) return sum;
                    else if(sum < target) {
                        if(target - sum < Math.abs(ans - target)) ans = sum;
                        j++;
                    } else {
                        if(sum - target < Math.abs(ans - target)) ans = sum;
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}