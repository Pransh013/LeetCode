class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        
        boolean[] visited = new boolean[n];
        visited[0] = true;
        
        Stack <Integer> newKeys = new Stack();
        newKeys.add(0);
        
        while(!newKeys.isEmpty()) {
            int currRoom = newKeys.pop();
            for(int key : rooms.get(currRoom)) {
                if(!visited[key]) {
                    visited[key] = true;
                    newKeys.add(key);
                }
            }
        }
        
        for(boolean check : visited) {
            if(!check) return false;
        }
        
        return true;
    }
}