class Solution {

    public String reverseWords(String s) {
        int lastSpaceIndex = -1;
        char[] arr= s.toCharArray();
        int n = s.length();
        for (int i = 0; i <= n; i++) {
            if (i == n || arr[i] == ' ') {
                int start = lastSpaceIndex + 1;
                int j = i - 1;
                while (start < j) {
                    char temp = arr[start];
                    arr[start] = arr[j];
                    arr[j] = temp;
                    start++;
                    j--;
                }
                lastSpaceIndex = i;
            }
        }
        return new String(arr);
    }

}