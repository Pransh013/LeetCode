class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        ArrayList<int[]> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        int r = restaurants.length;
        int c = restaurants[0].length;
        for(int[] row : restaurants) {
            if(veganFriendly == 1) {
                if(row[c-3] == 1 && row[c-2] <= maxPrice && row[c-1] <= maxDistance)
                    ans.add(row);
            } else {
                if(row[c-2] <= maxPrice && row[c-1] <= maxDistance)
                    ans.add(row);
            }
        }
        
        Collections.sort(ans,(a,b)->{
            return (a[1]!=b[1])?(b[1]-a[1]):b[0]-a[0];
        });
        
        for(int[] row : ans)
            al.add(row[0]);

        return al;
    }
}