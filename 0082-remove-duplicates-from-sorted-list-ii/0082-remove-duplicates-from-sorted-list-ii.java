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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode dummy = new ListNode(0);
       dummy.next = head;

        ListNode temp = dummy;
        ListNode fast = head;

        while(fast!=null){
            if(fast.next==null || fast.val!=fast.next.val){
               temp.next = fast;
               temp = fast;
               fast = fast.next;
            }else{// fast.val==fast.next.val
              ListNode slow = fast.next;
              while(slow!=null && slow.val==fast.val){
                slow = slow.next;
              }
              fast = slow;
            }
        }
        temp.next = fast;
       return dummy.next;
    }
}