class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        
        int[] a = new int[n * n];
        int idx = 0;
        for(int[] rows : matrix) 
            for(int val : rows)
                a[idx++] = val;
        
        Arrays.sort(a);
        return a[k - 1];
    }
}