class Solution {
    public List<Integer> getRow(int idx) {
        List<Integer> list = new ArrayList<>();
        long res = 1;
        for(int i = 0; i <= idx; i++) {
            list.add((int)res);
            res *= (idx - i);
            res /= i + 1;
        }
        return list;
    }
}