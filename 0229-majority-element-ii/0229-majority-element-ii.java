class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int n = arr.length;
        
        for(int ele : arr) {
            if(hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 1);
            }
        }
        
        for(int key : hm.keySet()) {
            if(hm.get(key) > n/3) 
                al.add(key);
        }
        
        return al;
    }
}