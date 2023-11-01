class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] row : arr) {
            revRow(row);
        }
    }
    
    private void revRow(int[] row) {
        int left = 0, right = row.length - 1;
        
        while(left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}