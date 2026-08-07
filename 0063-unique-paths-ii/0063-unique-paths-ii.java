class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       
       int n = obstacleGrid.length;
       int m = obstacleGrid[0].length;

       int[][] dp = new int[n][m];
       for(int[] i:dp){
        Arrays.fill(i,-1);
       }
       return func(obstacleGrid,dp,0,0,n,m);
      
    }
    public int func(int[][] a,int dp[][],int r,int c,int n,int m){

        if(r>=n|| c>=m){
            return 0;
        }
        if(a[r][c] ==1){
            return 0;
        }
        if(r==n-1 && c ==m-1 ){
            return 1;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        return dp[r][c] = func(a,dp,r,c+1,n,m)+func(a,dp,r+1,c,n,m);
    }
}