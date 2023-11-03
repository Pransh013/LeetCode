class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums) {
            if(set.contains(val)) list.add(val);
            else set.add(val);
        }
        return list;
    }
}