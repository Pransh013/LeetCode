class Solution {
    public int maxProductDifference(int[] nums) {
        int max = 0, smax = 0;
        int min = 10001, smin = 10001;
        
        for(int val : nums) {
            if(val > max) {
                smax = max;
                max = val;
            } else if(val > smax) smax = val;
            
            if(val < min) {
                smin = min;
                min = val;
            } else if(val < smin) smin = val;
        }
        return max * smax - min * smin;
    }
}