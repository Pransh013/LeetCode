class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int val : nums) {
            if(hm.containsKey(val))
                return true;
            else
                hm.put(val, 1);
        }
        return false;
    }
}