class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        
        List<Integer> list = new ArrayList<>();
        
        int tb = 0, bb = n - 1, lb = 0, rb = m - 1, tne = n * m;
        
        while(tne > 0) {
            for(int r = tb, c = lb; c <= rb && tne > 0; c++) {
                list.add(a[r][c]);
                tne--;
            }
            tb++;
            
            for(int c = rb, r = tb; r <= bb && tne > 0; r++) {
                list.add(a[r][c]);
                tne--;
            }
            rb--;
            
            for(int r = bb, c = rb; c >= lb && tne > 0; c--) {
                list.add(a[r][c]);
                tne--;
            }
            bb--;
            
            for(int c = lb, r = bb; r >= tb && tne > 0; r--) {
                list.add(a[r][c]);
                tne--;
            }
            lb++;
        }
        return list;
    }
}