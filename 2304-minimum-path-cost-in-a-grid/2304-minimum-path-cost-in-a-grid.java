class Solution {
    int[][] dp;
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int n = grid.length;
        int m = grid[0].length;
        
         dp = new int[n][m];
         
       for(int i =0;i<n;i++){
          Arrays.fill(dp[i],-1);
       }
        int ans = Integer.MAX_VALUE;
        
        for(int j=0;j<m;j++){
            int cost = grid[0][j]+ solve(grid,moveCost,0,j);
            ans = Math.min(cost,ans);
        }
        return ans;
    }   
    public int solve(int[][] grid,int[][] moveCost,int i ,int j){
         
         int n  = grid.length;
         int m = grid[0].length;
         int ans  = Integer.MAX_VALUE;
         
        
         if(i == n-1) return 0;
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        for(int k =0;k<m;k++){

            int cost =  grid[i+1][k] + 
                        moveCost[grid[i][j]][k] + solve(grid,moveCost,i+1 ,k);

            ans = Math.min(ans,cost);
        }
        return dp[i][j] = ans;
    }
}