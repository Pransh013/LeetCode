class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        if(k < 0)
            k += n;
        revArray(arr, 0, n-k-1);
        revArray(arr, n-k, n-1);
        revArray(arr, 0, n-1);
        
    }
    public static void revArray(int[] arr, int i, int j) {
        int start = i; int end = j;
        
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}