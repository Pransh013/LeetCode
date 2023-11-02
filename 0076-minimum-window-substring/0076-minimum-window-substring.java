class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int k = t.length();
        String ans = "";
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char ch : t.toCharArray()) tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        for(int i = 0, j = 0; j < s.length();) {
            char ch = s.charAt(j);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
            if(isFeasible(sMap, tMap)) {
                while(isFeasible(sMap, tMap)) {
                    sMap.put(s.charAt(i), sMap.get(s.charAt(i)) - 1);
                    i++;
                }
                i--;
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
                if(ans.equals("") || s.substring(i, j + 1).length() < ans.length())
                    ans = s.substring(i, j + 1);
            }
            j++;
        } 
        return ans;
    }
    private boolean isFeasible(HashMap<Character, Integer> sMap, HashMap<Character, Integer> tMap) {
        for(char key : tMap.keySet()) {
            if(!sMap.containsKey(key) || sMap.get(key) < tMap.get(key)) return false;
        }
        return true;
    }
}