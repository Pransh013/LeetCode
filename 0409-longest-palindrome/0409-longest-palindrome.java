class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int len = 0;
        boolean flag = false;
        for(char key : hm.keySet()) {
            if(hm.get(key) % 2 != 0) {
                len += hm.get(key) - 1;
                flag = true;
            } else {
                len += hm.get(key);
            }
        }
        return (flag) ? len + 1 : len;
    }
}