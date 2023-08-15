class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i=0;
        
        for(int e : arr) {
            if(i == 0 || i == 1 || arr[i-2] != e) {
                arr[i] = e;
                i++;
            }
        }
        return i;
    }
}