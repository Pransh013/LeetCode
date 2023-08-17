class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int nearSum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<n-2; i++) {
            if(i == 0 || i>0 && nums[i] != nums[i-1]) {
                int j = i+1;
                int k = n-1;
                while(j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    if(sum == target)
                        return target;
                    
                    if(Math.abs(target - sum) < Math.abs(target - nearSum)) 
                        nearSum = sum;
                    
                    if(sum < target) 
                        j++;    
                    else 
                        k--;
                }
            }
        }
        return nearSum;
    }
}