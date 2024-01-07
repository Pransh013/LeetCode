class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray( Integer[]::new );
        Arrays.sort(arr, (a, b) -> (b+""+a).compareTo(a+""+b));
        StringBuilder sb = new StringBuilder();
        
        for(int val : arr) sb.append(val);
        
        return Integer.valueOf(sb.toString().substring(0, 1)) > 0 ? sb.toString() : "0";
    }
}