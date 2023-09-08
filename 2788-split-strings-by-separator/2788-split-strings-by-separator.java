class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sep) {
        ArrayList<String> al = new ArrayList<>();
        
        for(String word : words) {
            String[] temp = word.split("["+sep+"]");
            
            for(String ans : temp) {
                if(!ans.isEmpty())
                    al.add(ans);
            }
        }
        return al;
    }
}