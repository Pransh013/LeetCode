class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j)))
                    j--;
                System.out.println(S.charAt(j));
                ans.append(S.charAt(j--));
            } else {
                System.out.println(S.charAt(i));
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }
}