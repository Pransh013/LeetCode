class Solution {
    public int[] minOperations(String str) {
        int n = str.length();
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++) {
            int steps = 0;
            
            for(int j=0; j<n; j++) {
                if(j != i && str.charAt(j) == '1')
                    steps += Math.abs(j - i);
            }
            ans[i] = steps;
        }
        return ans;
    }
}