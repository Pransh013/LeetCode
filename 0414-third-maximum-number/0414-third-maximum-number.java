class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinctNums = 1; 
        int n = nums.length;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] != nums[i+1])
                distinctNums++;
            else continue;
            
            if(distinctNums == 3)
                return nums[i];
        }
        return nums[n-1];
    }
}