class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        int[] freqMap = new int[n];
        
        for(int val : nums) {
            if(freqMap[val] != 0)
                return val;
            else
                freqMap[val]++;
        }
        return -1;
    }
}