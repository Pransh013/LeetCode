class Solution {
    public long minimalKSum(int[] arr, int k) {
        Arrays.sort(arr);
        
        long sum = 0;
        long num = 1;
        
        for (int ele : arr) {
            if (ele > num) {
                while (num < ele && k > 0) {
                    sum += num;
                    num++;
                    k--;
                }
            }
            num = ele+1;
            
        }
        while (k > 0) {
            sum += num;
            num++;
            k--;
        }
        
        return sum;
    }
}