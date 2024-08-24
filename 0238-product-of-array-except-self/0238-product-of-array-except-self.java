class Solution {
    public int[] productExceptSelf(int[] arr) {
        int pro = 1;
        int zeroCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) zeroCnt++;
            else pro *= arr[i];
        }
        
        int[] ans = new int[arr.length];
        
        if(zeroCnt == 0) {
            for(int i = 0; i < arr.length; i++) {
                ans[i] = pro / arr[i];
            } 
        } else if(zeroCnt == 1) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != 0) ans[i] = 0;
                else ans[i] = pro;
            }
        }
        return ans;
    }
}