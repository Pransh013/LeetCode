class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int[] arr = new int[mat.length];
        int idx = 0;
        for(int[] rows : mat) {
            int low = 0, high = rows.length - 1, ans = -1;
            
            while(low <= high) {
                int mid = low + ((high - low) / 2);
                
                if(rows[mid] == 1) {
                    ans = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            arr[idx] = ans + 1;
            System.out.print(arr[idx] + " ");
            idx++;
        }
        
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            ans[i] = minIdx;
            arr[minIdx] = Integer.MAX_VALUE;
        }
        return ans;
    }
}