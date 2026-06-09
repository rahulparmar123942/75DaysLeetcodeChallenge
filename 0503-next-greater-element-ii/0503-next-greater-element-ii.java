class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] gne = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i =2*n-1;i>=0;i--){
        
            while(st.size()>0 && st.peek()<=nums[i%n]){ 
                st.pop();
            }
            if(i<n){
            if(st.size()==0) gne[i] = -1;
            else gne[i] = st.peek();
            }
            st.push(nums[i%n]); 
            
        }
        return gne;
    }
}