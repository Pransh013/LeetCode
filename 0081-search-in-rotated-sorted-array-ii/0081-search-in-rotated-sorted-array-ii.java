class Solution {
    public boolean search(int[] nums, int k) {
        int n = nums.length;
    
        int l=0, h=n-1;
        
        while(l <= h) {
            int m = (l + h) / 2;
            
            if(nums[m] == k)
                return true;
            
//             the only case which is stopping us from implementing search in RSA-I solution here 
            if(nums[m] == nums[l] && nums[m] == nums[h]) {
                l++;
                h--;
                continue;
            }
            
//             check if right half is sorted
            else if(nums[h] >= nums[m]) {
//                 check if target lies in right sorted half
                if(k >= nums[m] && k <= nums[h])
                    l = m + 1;
                else
                    h = m - 1;
                
//             check if left half is sorted
            } else {
//                 check if target lies in left sorted half
                if(k >= nums[l] && k <= nums[m])
                    h = m - 1;
                else
                    l = m + 1;
            }
        }
        return false;
    }
}