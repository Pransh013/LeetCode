class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = people.length;
        int[] ans = new int[n];
        
        int[] bloomed = new int[flowers.length];
        int[] dead = new int[flowers.length];
        
        for(int i = 0; i < flowers.length; i++) {
            bloomed[i] = flowers[i][0];
            dead[i] = flowers[i][1];
        }
        
        Arrays.sort(bloomed);
        Arrays.sort(dead);
        
        for(int i = 0; i < n; i++) {
            int a = upperBound(bloomed, people[i]);
            int b = lowerBound(dead, people[i]);
            ans[i] = a - b;
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
    
    private int lowerBound(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= k) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}