class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
                
        String[] str = sentence.split(" ");
        
        for(int i = 0; i < dictionary.size(); i++) {
            String succ = dictionary.get(i);
            for(int j = 0; j < str.length; j++) {
                String word = str[j];
                
                if(succ.length() > word.length()) continue;
                if(succ.charAt(0) == word.charAt(0) && startsWith(succ, word)) str[j] = succ;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : str) sb.append(s + " ");
        return sb.toString().trim();
    }
    
    private boolean startsWith(String succ, String word) {
        return succ.equals(word.substring(0, succ.length()));
    }
}