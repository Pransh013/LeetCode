class Solution {
    public String reverseVowels(String s) {
        char[] temp = s.toCharArray();
        int i = 0, j = s.length() - 1;
        
        while(i < j) {
            if(isVowel(temp[i]) && isVowel(temp[j])) {
                swap(temp, i, j);
            } else if(isVowel(temp[i])) i--;
            else if(isVowel(temp[j])) j++;
            i++;
            j--;
        }
        return new String(temp);
    }
    
    private boolean isVowel(char ch) {
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}