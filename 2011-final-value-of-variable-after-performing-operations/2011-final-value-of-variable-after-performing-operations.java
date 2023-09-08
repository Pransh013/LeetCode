class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int ans = 0;
        
        for(String str : arr) {
            ans += (44 - str.charAt(1));
        }
        return ans;
    }
}