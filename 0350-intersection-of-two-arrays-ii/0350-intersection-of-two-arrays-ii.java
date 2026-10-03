class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> st1 = new ArrayList<>();
        for(int x:nums1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:nums2){
            if(map.containsKey(x) && map.get(x)>0){
                st1.add(x);
                map.put(x,map.get(x)-1);
            }
        }
        int[] ans = new int[st1.size()];

    
        for(int i=0;i<st1.size();i++ ){
            ans[i] = st1.get(i);
            
        }
        return ans;
    }
}