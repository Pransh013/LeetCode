class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray( Integer[]::new );
        Arrays.sort(arr, (a, b) -> (b+""+a).compareTo(a+""+b));
        if(arr[0] == 0) return "0";
        StringBuilder sb = new StringBuilder();
        
        for(int val : arr) sb.append(val);
        
        return sb.toString();
    }
}