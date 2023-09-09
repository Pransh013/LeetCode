class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
    
        int ans = arr[0];
        int cnt = 1;
        for(int i = 1; i<n; i++){
            if(arr[i] == ans) {
                cnt++;
            } else {
                cnt--;
            }
            
            if(cnt == 0) {
                ans = arr[i];
                cnt = 1;
            }
        }
        return ans;
    }
}