class Solution {
    public String[] findRelativeRanks(int[] scores) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> scores[b] - scores[a]);
        
        for(int i = 0; i < scores.length; i++) pq.add(i);
        
        String res[] = new String[scores.length];
        int j = 1;
        while(!pq.isEmpty()) {
            int i = pq.poll();
            
            if( j == 1 )
            {
                res[i] = "Gold Medal";
            }
            else if( j == 2 )
            {
                res[i] = "Silver Medal";
            }
            else if( j == 3 )
            {
                res[i] = "Bronze Medal";
            }
            else
            {
                res[i] = j + "";
            }
            j++;
        }
        return res;
    }
}