class Solution {
    int[][] dp;
    public int paintWalls(int[] cost, int[] time) {
        int n  =cost.length;
        dp = new int[n][n+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,cost,time,n);
    }
    public int helper(int i, int[] cost,int[] time,int n){
         
        if(n<=0){
            return 0;
        }
        if(i>= cost.length){
            return Integer.MAX_VALUE/2;
        }

        if(dp[i][n]!=-1){
            return dp[i][n];
        }
        int pick = cost[i] + helper(i+1,cost,time,n-(time[i]+1));
        int skip = helper(i+1,cost,time,n);

        return dp[i][n] =  Math.min(pick,skip);
    }
}