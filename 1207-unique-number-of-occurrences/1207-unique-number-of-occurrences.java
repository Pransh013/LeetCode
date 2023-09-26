class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        } 
        HashSet<Integer> set = new HashSet<>();
        for(int key : map.keySet()) {
            if(set.contains(map.get(key)))
                return false;
            set.add(map.get(key));
        }
        return true;
    }
}