class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        
        int min = 101;
        int k = 0;
        for(int i : nums) {
            k += i; 
            min = Math.min(min, k);
        }

        if(min >= 0)
            return 1;
        else
            return Math.abs(min) + 1;
        
    }
}