import java.util.*;
class Solution {
    private int subsetSum(int[] arr,int idx,int xor){
       if(idx==arr.length){
        return xor;
       }
      int include= subsetSum(arr,idx+1,xor^arr[idx]);
      int exclude =  subsetSum(arr,idx+1,xor);
      return include+exclude;
    }
    public int subsetXORSum(int[] arr) {
       
       return subsetSum(arr,0,0);
        
    }
}