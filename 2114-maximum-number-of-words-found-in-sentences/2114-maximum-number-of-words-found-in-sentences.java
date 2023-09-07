class Solution {
    public int mostWordsFound(String[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i=0; i<n; i++) {
            String[] temp = arr[i].split(" ");
            max = Math.max(max, temp.length);
        }
        return max;
    }
}