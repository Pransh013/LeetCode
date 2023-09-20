class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length % groupSize != 0) return false;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int val : hand) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }
        
        Arrays.sort(hand);
        
        for(int val : hand) {
            if(hm.get(val) > 0) {
                for(int i=0; i<groupSize; i++) {
                    int num = val + i;
                    
                    if(hm.getOrDefault(num, 0) <= 0) return false;
                    
                    hm.put(num, hm.get(num) - 1);
                }
            }
        }
        
        return true;
    }
}