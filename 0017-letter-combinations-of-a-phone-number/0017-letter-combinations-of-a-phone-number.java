class Solution {
    String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        return getAns(digits);
    }
    private List<String> getAns(String s) {
        if(s.length() == 0) {
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        int idx = s.charAt(0) - '0';
        String res = s.substring(1);
        
        List<String> rec = getAns(res);
        List<String> ans = new ArrayList<>();
        
        for(String str : rec) {
            for(char ch : codes[idx].toCharArray()) {
                ans.add(ch + str);
            }
        }
        return ans;
    }
}