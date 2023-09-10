class Solution {
    public static void duplicateZeros(int[] arr) {
        
        int n = arr.length;
        
        if(n == 1)
            return;
        
        int s = 0, e = n - 1;
        
        while(s < e) {
            if(arr[s] == 0)
                e--;
            s++;
        }
        
        if(e == n-1)
            return;
        
        for(int i=n-1; i>=0 && e>=0; i--, e--) {
            arr[i] = arr[e];
            
            if(s != e && arr[e] == 0)
                arr[i-- - 1] = 0;
        }
    }
}