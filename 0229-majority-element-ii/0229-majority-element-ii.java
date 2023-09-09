class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int n = arr.length;
        
        for(int i=0; i<n; i++) {
            if(hm.containsKey(arr[i])) {
                int of = hm.get(arr[i]);
                int nf = of + 1;
                hm.put(arr[i], nf);
            } else {
                hm.put(arr[i], 1);
            }
        }
        
        for(int key : hm.keySet()) {
            if(hm.get(key) > n/3) 
                al.add(key);
        }
        
        return al;
    }
}