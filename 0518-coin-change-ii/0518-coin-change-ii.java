class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
 
        int ans = solve(amount,coins,0,dp);

        if(ans== Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
    public int solve(int amount,int[] coins,int idx,int[][] dp){

        int n = coins.length;
        if(idx == n-1 ){
            if(amount%coins[n-1]==0){
                return 1;
            }else {
                return 0;
            }
        }

        // if(idx>=0 && amount!=0) return Integer.MIN_VALUE;

        if(dp[idx][amount]!=-1) return dp[idx][amount];

        int skip = solve(amount,coins,idx+1,dp);

        int pick = 0;

        if(amount>=coins[idx]){
            pick = solve(amount-coins[idx],coins,idx,dp);
        }
        return dp[idx][amount] = pick+skip;
    }
}