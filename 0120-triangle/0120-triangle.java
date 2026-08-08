class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       
       int n = triangle.size();

       int[] dp = new int[n];
        for(int j=0;j<n;j++){
            dp[j] = triangle.get(n-1).get(j);
        }
       for(int i= n-2;i>=0;i--){
        for(int j =0;j<=i;j++){
            int d = triangle.get(i).get(j) + dp[j];
            int dg = triangle.get(i).get(j) + dp[j+1];

            dp[j] = Math.min(d,dg);
        }
       }
       return dp[0];
    //    int[][] dp = new int[n][n];
    //    for(int[] row:dp){
    //     Arrays.fill(row,-1);
    //    }

    //    return solve(triangle,0,0,dp);
    // }
    // public int solve(List<List<Integer>> triangle,int i,int j,int[][] dp){

    //     int n = triangle.size();

    //     if(i == n-1) return triangle.get(i).get(j);
        
    //     if(dp[i][j]!=-1) return dp[i][j];

    //     int lf = triangle.get(i).get(j) + solve(triangle,i+1,j,dp);
    //     int lg = triangle.get(i).get(j) + solve(triangle,i+1,j+1,dp);

    //     return dp[i][j] = Math.min(lf,lg);



    }
}