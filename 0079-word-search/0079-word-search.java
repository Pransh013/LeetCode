class Solution {
    
    String s = "";
    
    public boolean exist(char[][] board, String word) {
        s = word;
        boolean[][] vis = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0))
                    if(search(board, i, j, 0, s, vis)) return true;
            }
        }
        return false;
    }
    
    private boolean search(char[][] board, int i, int j, int idx, String s, boolean[][] vis) {
        
        if(idx >= s.length()) return true;
        
        if(i < 0 || j < 0 || i == board.length || j == board[0].length || vis[i][j] || board[i][j] != s.charAt(idx)) return false;
        
        vis[i][j] = true;
        
        boolean a = search(board, i + 1, j, idx + 1, s, vis);
        boolean b = search(board, i - 1, j, idx + 1, s, vis);
        boolean c = search(board, i, j + 1, idx + 1, s, vis);
        boolean d = search(board, i, j - 1, idx + 1, s, vis);

        vis[i][j] = false;
        return a || b || c || d;
    }
}