class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        Stack<Integer> inc = new Stack<>();
        Stack<Integer> dec = new Stack<>();
        int max = -1;
        for(int val : nums) {
            if(inc.isEmpty()) inc.push(val);
            else {
                if(inc.peek() >= val) inc.clear();
                inc.push(val);
            }
            
            if(dec.isEmpty()) dec.push(val);
            else {
                if(dec.peek() <= val) dec.clear();
                dec.push(val);
            }

            max = Math.max(max, Math.max(inc.size(), dec.size()));

        }
        return max;
            
    }
}