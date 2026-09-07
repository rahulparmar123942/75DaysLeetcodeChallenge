class Solution {
    static int[][] dp;
    public int numDistinct(String s, String t) {
        
        int n = s.length();
        int m = t.length();

        dp = new int[n+1][m+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(s,t,n-1,m-1);
    }
    public int solve(String s, String t,int i , int j){

        // j is the length of t
        // i is the length of s

        if(j<0){
            return 1;
        }

        if(i < 0){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int nottake =0;
        int take =0;
        if(s.charAt(i)==t.charAt(j)){
         take = solve(s,t,i-1,j-1)+solve(s,t,i-1,j);
        }
         else{
         nottake= solve(s,t,i-1,j);
         }
       return dp[i][j]=  take+nottake;
    }
}