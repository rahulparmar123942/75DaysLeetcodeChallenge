class Solution {
     static int[] dp;
    public int cost(int[]arr,int i){
        if(i>=arr.length)return 0;

         if(dp[i]!=-1)return dp[i];

        int oneStep = arr[i] + cost(arr,i+1); 
        int secondStep = arr[i]+cost(arr,i+2);
        return  dp[i] = Math.min(oneStep,secondStep);
    }
    public int minCostClimbingStairs(int[] arr) {
        int n  = arr.length;
                                 
        dp = new int[n];
        Arrays.fill(dp,-1);
         return Math.min(cost(arr,1),cost(arr,0));
        
    }
}