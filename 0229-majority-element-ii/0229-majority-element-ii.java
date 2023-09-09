class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        
        int n = arr.length;
        
        for(int i=0; i<n; i++) {
            int cnt = 0;
            for(int j=0; j<n; j++) {
                if(arr[j] == arr[i])
                    cnt++;
                
                if(cnt > n/3) {
                    if(!al.contains(arr[i]))
                        al.add(arr[i]);
                    break;
                }
            }
        }
        return al;
    }
}