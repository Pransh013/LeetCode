class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 1, j = 2;
        
        while(j < arr.length) {
            if(arr[i - 1] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i + 1;
    }
}