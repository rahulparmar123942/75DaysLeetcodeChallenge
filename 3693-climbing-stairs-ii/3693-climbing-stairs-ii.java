class Solution {
    static int[] dp;
    public int climbStairs(int n, int[] costs) {
        
        dp = new int[n+1];
      
            Arrays.fill(dp,-1);
        
        return cost(n,costs,0);
    }
    public int cost(int n, int[] costs,int i){

       if(i==n) return 0;

        if(dp[i]!=-1) return dp[i];
           
        int pick1 = Integer.MAX_VALUE;
        int pick2 = Integer.MAX_VALUE;
        int pick3 = Integer.MAX_VALUE;
        
        if(i+1<=n){
            int jump = 1;
             pick1 = costs[i] + jump*jump + cost(n,costs,i+1);
        }
        if(i+2<=n){
            int jump = 2;
            pick2 = costs[i+1] + jump*jump+ cost(n,costs,i+2);
        }
        if(i+3<=n){
            int jump =3;
            pick3 = costs[i+2] +jump*jump + cost(n,costs,i+3);
        }

        return dp[i] = Math.min(pick1,Math.min(pick2,pick3));

    }
}