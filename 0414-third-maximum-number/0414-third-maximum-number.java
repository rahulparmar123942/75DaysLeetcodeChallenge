class Solution {
    public int thirdMax(int[] nums) {

        HashSet<Integer> st = new HashSet<>();
        for(int ele:nums){
            st.add(ele);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int arr:st){
            pq.add(arr);

            if(pq.size()>3) pq.remove();
        }
        if(pq.size()<3) {
            while(pq.size()>1){
                pq.remove();
            }
        }
        return pq.peek();
    }
}