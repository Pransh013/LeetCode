//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


class Solution { 
    public static int findSum(int A[],int N) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for(int val : A) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }
        return (max + min);
    }
}
