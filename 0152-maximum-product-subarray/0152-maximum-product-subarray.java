class Solution {
    public int maxProduct(int[] nums) {
        int currProd = 1, max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            currProd *= nums[i];
            max = Math.max(max, currProd);
            if(currProd == 0) currProd = 1;
        }
        
        currProd = 1;
        for(int i=n-1; i>=0; i--) {
            currProd *= nums[i];
            max = Math.max(max, currProd);
            if(currProd == 0) currProd = 1;
        }
        return max;
    }
}