class Solution {
    public int findFinalValue(int[] arr, int k) {
        
        HashSet<Integer> hs = new HashSet<>(arr.length);
        
        for(int i=0; i<arr.length; i++) {
            hs.add(arr[i]);
        }
        
        while(hs.contains(k))
            k *= 2;
        return k;
    }
}