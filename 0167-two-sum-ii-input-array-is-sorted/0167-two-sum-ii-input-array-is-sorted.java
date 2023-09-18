class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(target - arr[i]))
                return new int[]{hm.get(target-arr[i]) + 1, i+1};
            else
                hm.put(arr[i], i);
        }
        return new int[0];
    }
}