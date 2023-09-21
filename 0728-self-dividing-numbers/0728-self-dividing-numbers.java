class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList();
        
        for(int num=left; num<=right; num++) 
            if(isSelfDividing(num))
                nums.add(num);

        return nums;
    }
    public boolean isSelfDividing(int num) {
        
        for(char ch : String.valueOf(num).toCharArray())
            if(ch == '0' || num % (ch - '0') > 0)
                return false;

        return true;
    }
}