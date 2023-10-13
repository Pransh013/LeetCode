class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch, t.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
            
        for(int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            res.append(map.get(ch));
        }
        map.clear();
         
        boolean flag1 =  res.toString().equals(t);
        res.setLength(0);
        for(int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch, s.charAt(i));
            }
        }
            
        for(int i = 0; i <= s.length() - 1; i++) {
            char ch = t.charAt(i);
            res.append(map.get(ch));
        }
        
        boolean flag2 =  res.toString().equals(s);
        
        return (flag1 && flag2);
    }
}