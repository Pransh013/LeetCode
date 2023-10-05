//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int min = 1, max = stalls[n-1] - stalls[0];
        
        while(min <= max) {
            int mid = min + (max - min) / 2;
            
            if(canPlaceCows(stalls, mid, k)) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return max;
    }
    public static boolean canPlaceCows(int[] arr, int mid, int k) {
        int prev = arr[0];
        
        for(int val : arr) {
            if(val - prev >= mid) {
                k--;
                prev = val;
            }
            if(k == 1) break;
        }
        return k == 1;
    }
}