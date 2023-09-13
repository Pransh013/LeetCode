class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
    
        int l=0, h=n-1, ans = 5001;
        
        while(l <= h) {
            int m = (l + h) / 2;
            
            if(nums[m] <= ans)
                ans = nums[m]; 
            
//             check if right half is sorted
            if(nums[h] >= nums[m])
                h = m - 1;
//             check if left half is sorted
            else 
                l = m + 1;

        }
        return ans;
    }
}