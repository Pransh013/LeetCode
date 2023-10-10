class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, ans = n;
        Set<Integer> sorted = new TreeSet<>();
        for(int val : nums) sorted.add(val);
        
        int[] temp = new int[sorted.size()];
        int idx = 0;
        for(int val : sorted) temp[idx++] = val;
        
        for (int i = 0; i < temp.length; i++) {
            int min = temp[i];
            int max = min + (n - 1);
            int j = upperBound(temp, max);
            idx = j - i;
            ans = Math.min(ans, n - idx);
        }
        return ans;
    }
    private int upperBound(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}