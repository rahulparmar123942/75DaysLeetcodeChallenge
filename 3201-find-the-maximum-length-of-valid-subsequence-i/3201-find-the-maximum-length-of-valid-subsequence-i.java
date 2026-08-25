class Solution {
    public int maximumLength(int[] nums) {

       int oddCount =0;
       int evenCount =0;

       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            evenCount++;
        }else{
            oddCount++;
        }
       }

       int parity =nums[0]%2;
        int alternating =1;
       for(int i=0;i<nums.length;i++){
          int currParity = nums[i]%2;
          if(currParity!=parity){
            alternating++;
            parity = currParity;
          }
       }
         return Math.max(Math.max(oddCount,evenCount),alternating);
    }
}