class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i=1;
        int j=2;
        
        while(j < n) {
            if(arr[j] != arr[i-1]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i+1;
    }
}