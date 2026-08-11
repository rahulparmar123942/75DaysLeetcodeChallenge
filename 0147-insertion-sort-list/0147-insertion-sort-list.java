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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
       
       ListNode slow = head;
       ListNode fast = head;
       ListNode prev = null;
    
    while(fast!= null && fast.next!=null){
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    prev.next = null;

    ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode left = insertionSortList(head);
        ListNode right = insertionSortList(slow);

        while(left!=null && right!=null){

         if(left.val<right.val){
            temp.next = left;
            left = left.next;
            temp = temp.next;
         } else{
            temp.next = right;
            right = right.next;
            temp = temp.next;
         }      
        }
        if(left==null)temp.next = right;
        else temp.next = left;

        return dummy.next;
       
    }
}