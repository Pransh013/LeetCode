class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder sb = new StringBuilder();
        
        int i = 0, j = 0;
        
        while(i < w1.length() && j < w2.length()) {
            sb.append(w1.charAt(i++));
            sb.append(w2.charAt(j++));
        }
        
        sb.append(w1.substring(i, w1.length()));
        
        sb.append(w2.substring(j, w2.length()));
        
        return sb.toString();
    }
}