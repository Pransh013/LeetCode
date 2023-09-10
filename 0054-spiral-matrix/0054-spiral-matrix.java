class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        List<Integer> al = new ArrayList<>();
        
        int n = arr.length, m = arr[0].length;
        int minRow = 0, maxRow = n-1, minCol = 0, maxCol = m-1, cnt = 0; 
        
        while(cnt < n*m) {
            
    //         Upper Wall
            for(int r=minRow, c=minCol; c<=maxCol && cnt < n*m; c++) {
                al.add(arr[r][c]);
                cnt++;
            }
            minRow++;

    //         Right Wall
            for(int r=minRow, c=maxCol; r<=maxRow && cnt < n*m; r++) {
                al.add(arr[r][c]);
                cnt++;
            }
            maxCol--;

    //         Bottom Wall
            for(int r=maxRow, c=maxCol; c>=minCol && cnt < n*m; c--) {
                al.add(arr[r][c]);
                cnt++;
            }
            maxRow--;

    //         Left Wall
            for(int r=maxRow, c=minCol; r>=minRow && cnt < n*m; r--) {
                al.add(arr[r][c]);
                cnt++;
            }
            minCol++;
        }
        return al;
    }
}