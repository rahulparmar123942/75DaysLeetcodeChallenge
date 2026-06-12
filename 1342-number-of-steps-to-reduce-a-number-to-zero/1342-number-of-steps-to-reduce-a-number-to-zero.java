class Solution {
    private int count(int n , int count){
        if(n==0){
            return count;
        }
         if(n%2==0){
            return count(n/2,count+1);
         }else{
            return count(n-1,count+1);
         }
    }
    public int numberOfSteps(int n) {
      
       return count(n,0);
    }
}