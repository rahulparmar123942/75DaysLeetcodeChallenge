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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};// new int ki jagah {-1,-1} bbhi likh sakte hai

        int idx =1,fidx = -1,lidx = -1,minDist = Integer.MAX_VALUE;
        ListNode a = head;
        ListNode b = a.next;
        if(b==null)return ans;
        ListNode c= b.next;
        if(c== null) return ans;
        
        while(c!=null){
            if((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)){
                if(fidx== -1) fidx = idx;
                if(lidx != -1){
                    int dist = idx - lidx;
                    minDist = Math.min(minDist,dist);
                }
                lidx = idx;
            }
            idx++;
            a = a.next;
            b= b.next;
            c = c.next;
        }
        if(fidx == lidx)return ans;
        ans[0] = minDist;
        ans[1] = lidx-fidx;
        return ans;
    }
}