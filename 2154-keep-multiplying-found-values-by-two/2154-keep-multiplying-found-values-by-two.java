class Solution {
    public int findFinalValue(int[] arr, int k) {
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == k)
                k *= 2;
        }
        return k;
    }
}