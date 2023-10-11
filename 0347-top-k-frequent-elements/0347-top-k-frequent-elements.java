class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(hm.containsKey(arr[i])) {
                int of = hm.get(arr[i]);
                hm.put(arr[i], of + 1);
            } else hm.put(arr[i], 1);
        }
        
        int[] res = new int[k];
        int ans = 0, a = 0;
        while(k > 0) {
            int max = 0;
            for(int i=n-1; i>=0; i--) {
                if(hm.containsKey(arr[i]) && hm.get(arr[i]) > 0) {
                    if(hm.get(arr[i]) > max) {
                        max = hm.get(arr[i]);
                        ans = arr[i];
                    }
                }
            }
            res[a++] = ans;
            hm.put(ans, 0);
            k--;
        }
        return res;
    }
}