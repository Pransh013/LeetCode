//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int row, int col) {
        int lb = 0, tb = 0, rb = col, bb = row;
        ArrayList<Integer> list = new ArrayList<>();
        int tne = row * col;
        
        while(tne > 0) {
            for(int r = tb, c = lb; c < rb && tne-- > 0; c++) {
                list.add(matrix[r][c]);
            }
            tb++;
            
            for(int r = tb, c = rb - 1; r < bb && tne-- > 0; r++) {
                list.add(matrix[r][c]);
            }
            rb--;
            
            for(int r = bb - 1, c = rb - 1; c >= lb && tne-- > 0; c--) {
                list.add(matrix[r][c]);
            }
            bb--;
            
            for(int r = bb - 1, c = lb; r >= tb && tne-- > 0; r--) {
                list.add(matrix[r][c]);
            }
            lb++;
        }
        return list;
    }
}
