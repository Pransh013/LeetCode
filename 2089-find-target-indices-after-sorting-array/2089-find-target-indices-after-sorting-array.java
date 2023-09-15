class Solution {
    public List<Integer> targetIndices(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        int low = 0, high = arr.length - 1, first = -1, last = -1;

         while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == k) {
                first = mid;
                high = mid - 1;
            } else if(arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if(first == -1)
            return al;
        
        low = 0; 
        high = arr.length - 1;  
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == k) {
                last = mid;
                low = mid + 1;
            } else if(arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        while(first <= last)
            al.add(first++);
        
        return al;
    }
}