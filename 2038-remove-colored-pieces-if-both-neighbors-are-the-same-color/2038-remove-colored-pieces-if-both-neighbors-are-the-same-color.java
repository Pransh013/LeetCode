class Solution {
    public boolean winnerOfGame(String colors) {
        int a = 0, b = 0;
        for(int i = 1; i < colors.length() - 1; i++) {
            char curr = colors.charAt(i);
            char prev = colors.charAt(i - 1);
            char next = colors.charAt(i + 1);
            if(curr == prev && curr == next) {
                if(curr == 'A') a++;
                else b++;
            }
        }
        return a > b;
    }
}