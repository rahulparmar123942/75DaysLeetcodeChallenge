class Solution {
    public int lastStoneWeight(int[] stones){
      int idx  =0;
      int n = stones.length;
      if(n ==0)return 0;
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int ele:stones){
         pq.add(ele);
      } 
      while(pq.size()>1){
          int x;
          int y;
          x = pq.peek();
          pq.remove();
          y = pq.peek();
          pq.remove();
          int ans  = Math.abs(x-y);
          pq.add(ans);
      }
    
      return pq.peek();
    }
}