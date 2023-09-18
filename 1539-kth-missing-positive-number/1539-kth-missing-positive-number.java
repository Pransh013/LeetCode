class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = 1;
        for(int i=0; i<arr.length;) {
            if(arr[i] == n) {
                n++;
                i++;
            } else {
                k--;
                if(k == 0)
                return n;
                n++;
                
            }
        }
        return (k + n - 1);
    }
}