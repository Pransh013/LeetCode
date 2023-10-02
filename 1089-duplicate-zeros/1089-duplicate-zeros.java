class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroes = 0;
        if(arr.length == 1) return;
        for(int ele : arr)
            if(ele == 0)
                zeroes++;
        
        if(zeroes == 0) return;
        
        int i = arr.length - 1, j = arr.length + zeroes - 1;
        
        while(i != j) {
            shift(arr, i, j--);
            
            if(arr[i] == 0)
                shift(arr, i, j--);
            
            i--;
        }
    }
    public void shift(int[] arr, int i, int j) {
        if(j < arr.length)
            arr[j] = arr[i];
    }
}