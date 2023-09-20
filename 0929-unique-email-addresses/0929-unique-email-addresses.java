class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        
        for(String email : emails) {
            int idx = email.indexOf("@");
            String lName = email.substring(0, idx);
            String domain = email.substring(idx);
            
            if(lName.contains("+")) {
                int ptr = lName.indexOf("+");
                lName = lName.substring(0, ptr);
            }
            
            lName = lName.replaceAll("\\.", "");
            StringBuilder sb = new StringBuilder();
            sb.append(lName);
            sb.append(domain);

            set.add(sb.toString());
        }
        return set.size();
    }
}