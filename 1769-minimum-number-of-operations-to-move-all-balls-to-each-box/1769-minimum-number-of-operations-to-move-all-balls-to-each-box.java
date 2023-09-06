class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        
        int[] pre = new int[n];
        int[] suff = new int[n];
        
        int countOfBalls = boxes.charAt(0) - '0';
        for(int i=1; i<n; i++) {
            pre[i] = pre[i-1] + countOfBalls;
            if(boxes.charAt(i) == '1') countOfBalls++;
        }
        
        countOfBalls = boxes.charAt(n-1) - '0';
        for(int i=n-2; i>=0; i--) {
            suff[i] = suff[i+1] + countOfBalls;
            if(boxes.charAt(i) == '1') countOfBalls++;
        }
        
        for(int i=0; i<n; i++) {
            ans[i] = pre[i] + suff[i];
        }
        return ans;
    }
}