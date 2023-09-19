class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int val : nums) {
            if(hs.contains(val))
                return val;
            hs.add(val);
        }
        return -1;
    }
}