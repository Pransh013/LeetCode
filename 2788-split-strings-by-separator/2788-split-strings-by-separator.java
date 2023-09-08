class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sep) {
        ArrayList<String> al = new ArrayList<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();  
            for(int k=0; k<word.length(); k++){
                char ch = word.charAt(k);
                if(ch != sep){
                    sb.append(ch);
                }
                else {
                    if (sb.length() > 0) {
                        al.add(sb.toString()); 
                        sb.setLength(0);
                    }
                }
               
            }
            if (sb.length() > 0) {
                    al.add(sb.toString());
                }
        }

        return al;
    }
}