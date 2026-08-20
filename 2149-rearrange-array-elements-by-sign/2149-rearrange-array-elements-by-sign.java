/* 
   
*/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length; 
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
       int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans1.add(nums[i]);
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]>0){
                ans2.add(nums[j]);
            }
        }
          int idx =0;
        for(int k=0;k<n/2;k++){

            arr[idx++] = ans2.get(k);
            arr[idx++] = ans1.get(k);
        }
        return arr;
    }
}