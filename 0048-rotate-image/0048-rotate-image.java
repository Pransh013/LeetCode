class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      int li = 0;
      int ri = arr[0].length - 1;
      while (li <= ri) {
        int temp = arr[i][li];
        arr[i][li] = arr[i][ri];
        arr[i][ri] = temp;

        li++;
        ri--;
      }
    }
  }
}
