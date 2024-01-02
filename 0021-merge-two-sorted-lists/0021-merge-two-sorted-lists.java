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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode node1 = list1;
        ListNode node2 = list2;
        
        ListNode head = null;
        ListNode tail = null;
        
        while(node1 != null && node2 != null) {
            if(node1.val < node2.val) {
                if(head == null) head = node1;
                if(tail != null) tail.next = node1;
                tail = node1;
                node1 = node1.next;
            } else {
                if(head == null) head = node2;
                if(tail != null) tail.next = node2;
                tail = node2;
                node2 = node2.next;
            }
        }
        
        while(node1 != null) {
            if(head == null) head = node1;
            if(tail != null) tail.next = node1;
            tail = node1;
            node1 = node1.next;
        }
        
        while(node2 != null) {
            if(head == null) head = node2;
            if(tail != null) tail.next = node2;
            tail = node2;
            node2 = node2.next;
        }
        return head;
    }
}