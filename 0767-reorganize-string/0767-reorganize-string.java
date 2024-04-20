class Solution {
    public String reorganizeString(String s) {
        int[] temp = new int[26];
        int n = s.length();
        
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            temp[idx]++;
            
            if(temp[idx] > (n + 1) / 2) return "";
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> temp[b] - temp[a]);
        for(int i = 0; i < 26; i++) {
            if(temp[i] > 0) pq.add(i);
        }
        
        StringBuilder sb = new StringBuilder();
        int prev = -1;
        
        while(!pq.isEmpty() && sb.length() < n) {
            int idx = pq.poll();
            if(prev != -1) pq.add(prev);
            sb.append((char)(idx + 'a'));
            temp[idx]--;
            if(temp[idx] == 0) prev = -1;
            else prev = idx;
        }
        return sb.toString();
    }
}