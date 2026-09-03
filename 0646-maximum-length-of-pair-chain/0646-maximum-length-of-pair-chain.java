class Solution {
    static int[][] dp;
    public int findLongestChain(int[][] pairs) {
        
        int n  = pairs.length;
    

        Arrays.sort(pairs,(a,b)-> a[0]-b[0]);
       dp = new int[n+1][n+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(pairs,0,-1);
        return ans;
    }
    public int solve(int[][] pairs,int idx,int prev){
        int n = pairs.length;
        
        if(idx>=n ){
            return 0;
        }

        if(dp[idx][prev+1]!=-1){
            return dp[idx][prev+1];
        }
        
        int take = Integer.MIN_VALUE;
        if(prev==-1 || pairs[idx][0]>pairs[prev][1]){
             take = 1+solve(pairs,idx+1,idx);
        }
        int notTake = solve(pairs,idx+1,prev);

        return dp[idx][prev+1] = Math.max(take,notTake);
    }
}