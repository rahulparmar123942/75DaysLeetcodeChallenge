/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        int l1 =0;
        int l2=0;
        while(t1!=null){
            l1++;
            t1 = t1.next;
        }
        while(t2!=null){
            l2++;
            t2 = t2.next;
        }
        t1 =headA;
        t2 =headB;
        if(l1>l2){
            for(int i =0;i<(l1-l2);i++){
                t1 = t1.next;
            }
        }
        else {
            for(int j =0;j<(l2-l1);j++){
                t2 = t2.next;
            }
        }
        while(t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}