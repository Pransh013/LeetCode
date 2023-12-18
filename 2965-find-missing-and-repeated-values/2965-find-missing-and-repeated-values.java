class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int x = n * n;
        int[] a = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int[] row : grid) {
            for(int val : row) {
                sum += val;
                if(set.contains(val)) {
                    a[0] = val;
                }
                set.add(val);
            }
        }
        sum -= a[0];
        a[1] = x * (x + 1) / 2 - sum;
        return a;
    }
}