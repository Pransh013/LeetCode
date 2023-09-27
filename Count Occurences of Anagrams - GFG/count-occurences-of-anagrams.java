//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();
        
        int patSum = 0, currSum = 0, cnt = 0;;
        int[] patMap = new int[26];
        int[] txtMap = new int[26];
        
        for(int i = 0; i < k; i++) {
            patSum += pat.charAt(i);
            patMap[pat.charAt(i) - 'a']++;
            currSum += txt.charAt(i);
            txtMap[txt.charAt(i) - 'a']++;
        }
        
        boolean flag = false;
        for(int i = 0; i < 26; i++) {
            if(patMap[i] != txtMap[i])
                flag = true;
        }
        if(!flag) cnt++;
        
        for(int i = 0, j = k; j < n; j++) {
            currSum = currSum + txt.charAt(j) - txt.charAt(i);
            txtMap[txt.charAt(j) - 'a']++;
            txtMap[txt.charAt(i) - 'a']--;
            if(currSum == patSum) {
                flag = false;
                for(int a = 0; a < 26; a++) {
                    if(patMap[a] != txtMap[a])
                        flag = true;
                }
                if(!flag) cnt++;
            }
            i++;
        }
        return cnt;
    }
}