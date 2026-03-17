class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        
        pq.addAll(map.keySet());
        
        int[] res = new int[k];
        
        for(int i = 0; i < k; i++){
            res[i] = pq.poll();
        }
        
        return res;
    }
}