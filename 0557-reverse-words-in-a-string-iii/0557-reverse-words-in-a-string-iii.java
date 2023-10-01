class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(String str : temp) {
            cnt++;
            String rev = reverse(str);
            sb.append(rev);
            if(cnt >= 1 && cnt < temp.length) sb.append(" ");
        }
        return sb.toString();
    }
    private String reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j) {
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
}