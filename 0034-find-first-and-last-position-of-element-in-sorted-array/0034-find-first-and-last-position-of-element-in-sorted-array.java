class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        
        int lb = lowerBound(nums, n, target);
        if(lb == n || nums[lb] != target)
            return new int[]{-1, -1};
        int ub = upperBound(nums, n, target);
        
        return new int[]{lb, ub - 1};
    }
    public int lowerBound(int[] arr, int n, int k) {
        int l=0, h=n;
        
        while(l < h) {
            int m = (l + h) / 2;
            
            if(arr[m] < k)
                l = m + 1;
            else
                h = m;
        }
        return h;
    }
    
    public int upperBound(int[] arr, int n, int k) {
        int l=0, h=n;
        
        while(l < h) {
            int m = (l + h) / 2;
            
            if(arr[m] <= k)
                l = m + 1;
            else
                h = m;
        }
        return h;
    }
}