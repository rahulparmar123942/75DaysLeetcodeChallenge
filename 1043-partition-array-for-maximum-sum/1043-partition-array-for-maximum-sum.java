class Solution {
    static int[] dp;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        int n = arr.length;
        
        dp = new int[n+1];
        Arrays.fill(dp,-1);

        return solve(arr,k,0);
    }
    public int solve(int[] arr,int k, int idx){

        int n = arr.length;
        if(idx>=arr.length){
            return 0;
        }
         if(dp[idx]!=-1){
            return dp[idx];
         }
            int result =0;
            int currMax =-1;
            for(int j=idx;j<arr.length &&j-idx+1<=k;j++){
                 currMax = Math.max(currMax,arr[j]);
                 
                result= Math.max(result,((j-idx+1)*currMax) +solve(arr,k,j+1));
                 
            }
            return dp[idx]= result;
    }
}