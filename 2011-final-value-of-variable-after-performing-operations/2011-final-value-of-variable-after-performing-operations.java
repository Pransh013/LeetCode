class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int ans = 0;
        
        for(String str : arr) {
            if(str.contains("+")) ans++;
            else ans--;
        }
        return ans;
    }
}