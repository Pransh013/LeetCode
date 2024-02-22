class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, sum = nums[0], ans = Integer.MAX_VALUE;
        
        while(j < nums.length) {
            if(sum < target) {
                j++;
                if(j >= nums.length) break;
                sum += nums[j];
            } else if(sum > target) {
                ans = Math.min(ans, j - i + 1);
                sum -= nums[i];
                i++;
            } else {
                ans = Math.min(ans, j - i + 1);
                sum -= nums[i];
                i++;
                j++;
                if(j >= nums.length) break;
                sum += nums[j];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
// ans = 4 - 2 + 1 = 2
// sum = 3
//           i
//             j
// 2,3,1,2,4,3
    
//     ans = 3