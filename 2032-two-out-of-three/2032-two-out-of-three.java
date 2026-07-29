class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       
        HashSet<Integer> st = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = nums3.length;
        for(int i =0;i<n1;i++){
            int a = nums1[i];
            for(int j=0;j<n2;j++){
                int b = nums2[j];
                 if(a==b){
                    st.add(a);
                 }
               for(int k=0;k<n3;k++){
                  if(a==nums3[k] || b == nums3[k]){
                    st.add(nums3[k]);
                  }
               }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(st);
        return list;
    }
}