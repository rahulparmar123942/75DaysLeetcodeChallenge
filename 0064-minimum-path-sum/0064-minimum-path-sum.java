class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

         int[][] dp = new int[n][m];

         for(int[] row:dp){
            Arrays.fill(row,-1);
         }
         return solve(grid,0,0,dp);
    }
    public int solve(int[][] grid,int i ,int j,int[][]dp){
         
         int n = grid.length;
         int m = grid[0].length;

         
              if(i>=n || j>=m)
              return Integer.MAX_VALUE;
              
              if(i == n-1 && j == m-1) {
              return grid[i][j];
              }
              if(dp[i][j]!=-1)
                return dp[i][j];

              int left = solve(grid,i,j+1,dp);
              int down = solve(grid,i+1,j,dp);
        
               return dp[i][j] = grid[i][j]+Math.min(left,down);
            
    }
}
       