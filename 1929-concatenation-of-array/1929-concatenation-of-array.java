class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] a = new int[2 * n];
        
        int j = 0;
        int k = n;
        for(int i = 0; i < n; i++) {
            a[j] = nums[i];
            a[k] = nums[i];
            j++;
            k++;
        }
        return a;
    }
}