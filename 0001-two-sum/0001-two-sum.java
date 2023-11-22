class Solution {
    private class Pair implements Comparable<Pair> {
        int val;
        int idx;
        
        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
        public int compareTo(Pair temp) {
            return this.val - temp.val;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Pair[] pairs = new Pair[nums.length];
        for(int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair(nums[i], i);
        }
        
        Arrays.sort(pairs);
        for(int i = 0, j = pairs.length - 1; i < j;) {
            int a = pairs[i].val;
            int b = pairs[j].val;
            
            if(a + b == target) {
                return new int[] {pairs[i].idx, pairs[j].idx};
            } else if(a + b > target) j--;
            else i++;
        }
        return new int[0]; 
    }
}