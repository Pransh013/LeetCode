class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int cnt1 = 0, cnt2 = 0, num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE;
        for(int val : arr) {
            if(val == num1) cnt1++;
            else if(val == num2)cnt2++;
            else if(cnt1 == 0) {
                num1 = val;
                cnt1 = 1;
            }   
            else if(cnt2 == 0) {
                num2 = val;
                cnt2 = 1;
            }
            else {
                cnt1--; cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for(int val : arr) {
            if(val == num1) cnt1++;
            if(val == num2) cnt2++;
        }
        if(cnt1 > n / 3) al.add(num1);
        if(cnt2 > n / 3) al.add(num2);
        return al;
    }
}
