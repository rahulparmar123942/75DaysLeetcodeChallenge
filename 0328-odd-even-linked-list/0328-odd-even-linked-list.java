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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp= head;
        ListNode d1 = new ListNode(0);
        ListNode t1 = d1;

        ListNode d2 = new ListNode(-1);
        ListNode t2 = d2;
        int len =0;

        while(temp!=null){
        len++;
        temp = temp.next;
        } 

        ListNode temp1 =head;
        for(int i =0;i<len;i++){
            if(i%2!=0){
                t1.next = temp1;
                t1 = t1.next;
            }else{
                t2.next = temp1;
                t2 = t2.next;
            }
            temp1 = temp1.next;
        }

        t2.next = d1.next;
        t1.next = null;
        return d2.next;

    }
}