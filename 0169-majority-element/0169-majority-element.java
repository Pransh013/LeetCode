class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n/2];
        return ans;
    }
}