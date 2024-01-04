class Solution {
    public int compress(char[] arr) {
        if(arr.length == 1) return arr.length;
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        int cnt = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) cnt++;
            else {
                if(cnt > 1) sb.append(cnt);
                sb.append(arr[i]);
                cnt = 1;
            }
        }
        if(cnt > 1) sb.append(cnt);
        
        for(int i = 0; i < sb.length(); i++) arr[i] = sb.charAt(i);
        return sb.length();
    }
}