class Solution {
    public void moveZeroes(int[] arr) {
        int s=0;
        int k=0;
        int n = arr.length;
        while(s < n) {
            if(arr[s] == 0) {
                k++;
            } else if(k > 0) {
                int temp = arr[s];
                arr[s] = 0;
                arr[s-k] = temp;
            }
            s++;
        }
    }
}