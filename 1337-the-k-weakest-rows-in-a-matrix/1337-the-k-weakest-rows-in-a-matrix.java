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
            arr[idx++] = ans + 1;
        }
        
        Integer[] indices = new Integer[arr.length];
        for (int i = 0; i < indices.length; i++)
            indices[i] = i;
    
        Arrays.sort(indices, (a, b) -> (arr[a] - arr[b]));         // Can also use Integer.compare(arr[a], arr[b])

        int[] res = new int[k];
        for(int i=0; i<k; i++)
            res[i] = indices[i];
        return res;
    }
}