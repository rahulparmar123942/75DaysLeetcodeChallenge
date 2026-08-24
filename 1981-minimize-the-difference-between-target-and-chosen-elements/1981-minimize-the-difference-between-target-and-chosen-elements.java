class Solution {
    static int[][] dp;
    public int minimizeTheDifference(int[][] mat, int target) {
        

        int n = mat.length;
        int m = mat[0].length;
        int maxSum =4900;
        dp = new int[n+1][maxSum+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(mat,target,0,0,0);
    }
    public int solve(int[][] mat,int target,int r,int c,int sum){
       
       if(r == mat.length){
        return Math.abs(sum-target);
       }
        
        if(c == mat[0].length){
            return Integer.MAX_VALUE;
        }
       
        if(dp[r][sum]!=-1) return dp[r][sum];

        int left = solve(mat,target,r+1,0,sum+mat[r][c]);
        int right = solve(mat,target,r,c+1,sum);
        return dp[r][sum] = Math.min(left,right);
    }
}