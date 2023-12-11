class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        
        for(int val : candies) {
            if(val > max) max = val;
        }
        
        for(int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= max);
        }
        return list;
    }
}