class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(nums[i] > nums[max])
                max = i;
        }
        
        Arrays.sort(nums);
        
        return (nums[n-1] >= 2 * nums[n-2]) ? max : -1;
    }
}