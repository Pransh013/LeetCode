class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        
        int i = 0;
        int currLen = 0;
        int maxLen = 0;
        
        while(i < arr.length) {
            int curr = arr[i];
            if(curr == 1) {
                currLen++;
            } else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 0;
            }
            i++;
        }
        return Math.max(maxLen, currLen);
        
    }
}