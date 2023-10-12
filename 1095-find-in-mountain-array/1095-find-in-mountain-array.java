/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 1, high = mountainArr.length() - 2;
        int peakIdx = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid - 1))
                low = mid + 1;
            else high = mid - 1;
        }
        peakIdx = high;
        low = 0;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(mountainArr.get(mid) == target) return mid;
            if(mountainArr.get(mid) < target) low = mid + 1;
            else high = mid - 1;
        }
        low = peakIdx + 1;
        high = mountainArr.length() - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(mountainArr.get(mid) == target) return mid;
            if(mountainArr.get(mid) > target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}