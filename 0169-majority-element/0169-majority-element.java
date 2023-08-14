class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int count = 1;
            for(int j = 1;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
            }
             
            if(count>=(n+1)/2){
                max = count;
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
}