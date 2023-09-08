class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sep) {
        ArrayList<String> al = new ArrayList<>();
        
        for(int i=0; i<words.size(); i++) {
            String[] temp = words.get(i).split("["+sep+"]");
            
            for(int j=0; j<temp.length; j++) {
                if(!temp[j].isEmpty())
                    al.add(temp[j]);
            }
        }
        return al;
    }
}