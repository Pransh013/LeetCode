class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        if(n <= 2) return true;
        int i = 1, cnt = 0;
        
        while(i < n) {
            if(arr[i] < arr[i - 1]) {
                cnt++;
                i++;
                continue;
            }
            i++;
        }
        if(cnt == 0 || (cnt == 1 && arr[0] >= arr[n - 1])) return true;
        return false;
    }
}