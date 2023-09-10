/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int n, int m, ListNode head) {
        
        int[][] arr = new int[n][m];
        
        for(int[] rows : arr) 
            Arrays.fill(rows, -1);
        
        int minRow = 0, maxRow = n-1, minCol = 0, maxCol = m-1; 
        
        while(head != null) {
            
    //         Upper Wall
            for(int r=minRow, c=minCol; c<=maxCol && head!=null; c++) {
                arr[r][c] = head.val;
                head = head.next;
            }
            minRow++;

    //         Right Wall
            for(int r=minRow, c=maxCol; r<=maxRow && head!=null; r++) {
                arr[r][c] = head.val;
                head = head.next;
            }
            maxCol--;

    //         Bottom Wall
            for(int r=maxRow, c=maxCol; c>=minCol && head!=null; c--) {
                arr[r][c] = head.val;
                head = head.next;
            }
            maxRow--;

    //         Left Wall
            for(int r=maxRow, c=minCol; r>=minRow && head!=null; r--) {
                arr[r][c] = head.val;
                head = head.next;
            }
            minCol++;
        }
        return arr;
    }
}