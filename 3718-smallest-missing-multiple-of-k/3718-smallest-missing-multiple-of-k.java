class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> st = new HashSet();
        
        int n = nums.length;
    
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        
        int pro = k;
        while(st.contains(pro)){
            pro +=k;
        }
        return pro;
    }
}