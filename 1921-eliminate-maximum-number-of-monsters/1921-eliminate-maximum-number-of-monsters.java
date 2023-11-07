class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] arrival = new int[dist.length];
        for (int i = 0; i < dist.length; i++) {
            arrival[i] = (dist[i] / speed[i]) + (dist[i] % speed[i] == 0 ? 0 : 1);
        }
        
        Arrays.sort(arrival);
        int ans = 0;
        
        for (int i = 0; i < arrival.length; i++) {
            if (arrival[i] <= i) {
                break;
            }
            
            ans++;
        }
        
        return ans;
    }
}