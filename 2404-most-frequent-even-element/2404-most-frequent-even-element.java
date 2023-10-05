class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            if((i & 1) == 0)
                map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int num = -1;
        for(int key : map.keySet()) {
            if(map.get(key) > map.getOrDefault(num, 0)) num = key;
            else if(map.get(key) == map.get(num) && num > key) num = key;
        }
        return num;
    }
}