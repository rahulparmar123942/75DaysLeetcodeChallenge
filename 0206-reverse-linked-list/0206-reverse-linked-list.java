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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode a  = head;
        ListNode b = head;
        ListNode h = head;
        a = h.next;
        h.next =null;
        b  = reverseList(a);
        a.next  = h;

        return b;
    }
}