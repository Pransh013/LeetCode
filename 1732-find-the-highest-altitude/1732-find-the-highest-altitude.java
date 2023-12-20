class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, max = 0;
        
        for(int val : gain) {
            sum += val;
            max = max < sum ? sum : max; 
        }
        return max;
    }
}