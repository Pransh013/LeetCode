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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        
        int data = 0, carry = 0;
        
        ListNode prev = null;
        ListNode curr = null;
        
        while(l1 != null || l2 != null || carry != 0) {
            data = carry;
            
            if(l1 != null) {
                data += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null) {
                data += l2.val;
                l2 = l2.next;
            }
            
            carry = data / 10;
            data = data % 10;
            
            curr = new ListNode(data);
            if(prev == null) {
                head = curr;
            } else {
                prev.next = curr;
            }
            prev = curr;
        }
        return head;
    }
}