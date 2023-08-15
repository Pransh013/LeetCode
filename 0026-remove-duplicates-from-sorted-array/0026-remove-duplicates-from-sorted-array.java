class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i=0;
        int j=1;
        
        while(j < n) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            } 
            j++;
        }
        return i+1;
    }
}