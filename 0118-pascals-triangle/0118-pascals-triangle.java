class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < rows; i++) {
            long res = 1;
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                temp.add((int)res);
                res *= i - j;
                res /= j + 1;
            }
            list.add(temp);
        }
        return list;
    }
}