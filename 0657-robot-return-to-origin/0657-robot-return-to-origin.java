class Solution {
    public boolean judgeCircle(String moves) {
        int y_axis = 0, x_axis = 0;
        
        for(char ch : moves.toCharArray()) {
            if(ch == 'R')
                x_axis++;
            else if(ch == 'L')
                x_axis--;
            else if(ch == 'U')
                y_axis++;
            else
                y_axis--;
        }
        return (x_axis == 0) && (y_axis == 0);
    }
}