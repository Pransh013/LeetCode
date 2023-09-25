class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            if(asteroids[i] > 0) st.push(asteroids[i]);
            else {
                if(!st.isEmpty() && st.peek() > 0) {
                    while(!st.isEmpty() && st.peek() > 0 && Math.abs(asteroids[i]) > st.peek()) st.pop();
                    
                    if(st.isEmpty()) st.push(asteroids[i]);
                    
                     else if(st.peek() < 0) st.push(asteroids[i]);
                     else if(Math.abs(asteroids[i]) == st.peek()) {
                        st.pop();
                        continue;
                    } else continue;
                    
                } else st.push(asteroids[i]);
            }
        }
        
        int[] ans = new int[st.size()];
        int idx = st.size(); 
        while(!st.isEmpty()) {
            ans[--idx] = st.pop();
        }
        return ans;
    }
}