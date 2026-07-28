
import java.util.*;
class Triplet implements Comparable <Triplet>{
    int val;
    int a;
    int b;

    Triplet(int val,int b ){

        this.val = val;
        this.a = Math.abs(b-val);
        this.b = b;

    }
    public int compareTo(Triplet t){
        if(this.a == t.a) return t.b - this.b; // comparison ho raha hai yaha pe
        return t.a - this.a;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
          
         PriorityQueue<Triplet> pq = new PriorityQueue<>();
         

        for(int ele:arr){
            int b = ele;
            
            pq.add(new Triplet(x,b));
          if(pq.size()>k) pq.remove();
        }

        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<k;i++){
            Triplet top = pq.remove();
            ans.add(top.b);
        }
        Collections.sort(ans);
        return ans;
    }
}