class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int n = arr.length;

         int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }

         if(sum%3!=0) return false;
        int target = sum/3;

         
       int currSum =0;
       int parts =0;

       for(int x:arr){
            currSum +=x;
          if(currSum == target){
            parts++;
            currSum =0;
          }
       }
        return parts>=3;
    }
}