class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        
        int n = nums.length;
 
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

        ArrayList<Integer> current = new ArrayList<>();
        current.add(sorted[0]);

        for(int i=1;i<n;i++){

            if(sorted[i]-sorted[i-1]<=limit){
                current.add(sorted[i]);
            }else{
                groups.add(current);
                current = new ArrayList<>();
                current.add(sorted[i]);
            }
        }
        groups.add(current);

        HashMap<Integer,Integer> groupMap = new HashMap<>();

        for(int i=0;i<groups.size();i++){
            
            for(int value:groups.get(i)){
                groupMap.put(value,i);
            }
        }

        HashMap<Integer,Queue<Integer>> map = new HashMap<>();

        for(int i=0;i<groups.size();i++){
           Queue<Integer> q = new LinkedList<>();
               for(int value:groups.get(i)){
                 q.add(value);
               }
            map.put(i,q);
        }

        for(int i=0;i<n;i++){

            int group = groupMap.get(nums[i]);
            nums[i] = map.get(group).poll();
        }
        return nums;
    }
}