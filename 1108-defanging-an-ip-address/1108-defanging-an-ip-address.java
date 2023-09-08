class Solution {
    public String defangIPaddr(String address) {
        String str = "";
        int i = 0;
        while(i < address.length()) {
            if(address.charAt(i) == '.') str += "[.]";
            else str += address.charAt(i);
            i++;
        }
        return str;
    }
}