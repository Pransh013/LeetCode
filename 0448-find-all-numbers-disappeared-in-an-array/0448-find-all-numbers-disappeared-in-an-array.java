class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        boolean[] check = new boolean[n + 1];
        
        for(int i = 0; i < n; i++) check[nums[i]] = true;
        for(int i = 1; i <= n; i++) if(!check[i]) list.add(i);
        
        return list;
    }
}