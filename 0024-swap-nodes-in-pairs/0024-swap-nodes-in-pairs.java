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
    public ListNode swapPairs(ListNode head) {
      if(head== null || head.next ==null) return head;
      ListNode temp = head;

      ListNode d1 = new ListNode(0);
      ListNode t1 = d1;// ye abhi d1 pe point kar rhaa hai 

      ListNode d2 = new ListNode(-1);
      ListNode t2 = d2;// ye abhi d2 pe point kar raha hai 

      int len =0;
      while(temp!=null){
        len++;
        temp = temp.next;
      }
      ListNode temp1 = head;

      for(int i =1;i<=len;i++){
        if(i%2!=0){
            d1.next = temp1;
            d1 = d1.next;
        }else{
            d2.next = temp1;
            d2 = d2.next;
        }
        temp1  = temp1.next;
      }
      d1.next = null;
      d2.next = null;

      ListNode p1 = t1.next;
      ListNode p2 = t2.next;

      ListNode dummy = new ListNode(0);
      ListNode tail = dummy;
      while(p1!=null && p2!=null){
          tail.next = p2;
          tail = tail.next;
          p2 = p2.next;

          tail.next = p1;
          tail = tail.next;
          p1 = p1.next;
          
      }
      return dummy.next;
    }
}