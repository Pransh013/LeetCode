class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int max = Math.max(Math.abs(fx - sx), Math.abs(fy - sy));
        if(max == 0 && t == 1) return false;
        return t >= max;
    }
}