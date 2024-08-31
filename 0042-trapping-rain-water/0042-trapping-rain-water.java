class Solution {
    public int trap(int[] arr) {
        int[] leftGreater = findLeftGreater(arr);
        int[] rightGreater = findRightGreater(arr);
        
        int ans = 0;
        
        for(int i = 0; i < arr.length; i++) {
            int water = Math.min(leftGreater[i], rightGreater[i]) - arr[i];
            if(water > 0) ans += water;
        }
        return ans;
    }
    
    public static int[] findLeftGreater(int[] arr) {
        int val = 0;
        int[] leftGreater = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            leftGreater[i] = val;
            if(arr[i] > val) val = arr[i];
        }
        return leftGreater;
    }
    
    public static int[] findRightGreater(int[] arr) {
        int val = 0;
        int[] rightGreater = new int[arr.length];
        
        for(int i = arr.length - 1; i >= 0; i--) {
            rightGreater[i] = val;
            if(arr[i] > val) val = arr[i];
        }
        return rightGreater;
    }
}