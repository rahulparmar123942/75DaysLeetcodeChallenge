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
    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode curr  = head;
        ListNode fwd  = null;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }   

    public void reorderList(ListNode head) {
        if(head== null || head.next== null) return;

        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2  = slow.next;
        slow.next = null;
        head2  = reverse(head2);

        ListNode i = head;
        ListNode j = head2;
        
        while(j!=null){
           ListNode temp1 = i.next;
           ListNode temp2 = j.next;
           
           i.next  = j;
           j.next = temp1;
           i = temp1;
           j = temp2;
        }
    }
}