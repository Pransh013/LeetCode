class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
        int i = 0, j = n - 1, area = -1;
        while(i <= j) {
            if(height[i] <= height[j]) {
                area = Math.max(area, height[i]*(j - i));
                i++;
            } else {
                area = Math.max(area, height[j]*(j - i));
                j--;
            }
        }
        return area;
    }
}