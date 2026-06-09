class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
       int[] ans  = new int[arr1.length];

       for(int i =0;i<arr1.length;i++){
            int idx = - 1;
            for(int j =0;j<arr2.length;j++){
                if(arr2[j]== arr1[i]){
                    idx = j;
                    break;
                }
            }
            ans[i] = -1;
            for(int j = idx+1;j<arr2.length;j++){
                if(arr2[j]>arr1[i]){
                    ans[i] = arr2[j];
                    break;
                }
            }
       }
       return ans;
    }
}