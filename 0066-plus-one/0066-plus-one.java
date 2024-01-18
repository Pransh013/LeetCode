class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean flag = false;
        for(int val : digits) {
            if(val != 9) {
                flag = true;
                break;
            }
        }
        
        if(flag) {
            digits[n - 1] += 1;
            for(int i = n - 1; i > 0; i--) {
                if(digits[i] > 9) {
                    digits[i] = digits[i] % 10;
                    digits[i - 1] += 1;
                }
            }
            return digits;
        }
        
        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
    }
}