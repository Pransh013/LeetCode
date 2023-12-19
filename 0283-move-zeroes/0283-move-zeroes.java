class Solution {
    public void moveZeroes(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int j = i + 1;
                while(j < arr.length && arr[j] == 0) j++;
                if(j < arr.length)
                    swap(arr, i, j);
            }
        }
    }
    
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}