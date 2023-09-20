class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length % groupSize != 0) return false;
        
        TreeMap<Integer, Integer> tm = new TreeMap();
        
        for(int val : hand) {
            if(tm.containsKey(val)) {
                tm.replace(val, tm.get(val) + 1);
            } else
                tm.put(val, 1);
        }
        
        while(tm.size() > 0) {
            int curr = tm.firstKey();
        
            for(int i=curr; i<curr + groupSize; i++) {
                if(!tm.containsKey(i)) return false;
                int cnt = tm.get(i);
                if(cnt == 1) 
                    tm.remove(i);
                else
                    tm.replace(i, tm.get(i) - 1);
            }
        }
        
        return true;
    }
}