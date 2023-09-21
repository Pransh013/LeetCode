class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList();
        
        for(int num=left; num<=right; num++) {
            if(isSelfDividing(num))
                nums.add(num);
        }
        return nums;
    }
    public boolean isSelfDividing(int num) {
        int temp = num;
        
        while(temp > 0) {
            int dig = temp % 10;
            if(dig == 0 || num % dig > 0) return false;
            temp /= 10;
        }
        return true;
    }
}