
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode f = null;

        while(curr!=null){
            f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        for(int i =1;i<=l-1;i++){
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2  = temp.next;

        for(int i=1;i<=r-l+1;i++){
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;
        tail1.next = null;
        tail2.next = null;

         tail2 = reverse(head2);

        tail1.next= tail2;
        head2.next = head3;

        return dummy.next;
    }
}