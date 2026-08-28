class Solution {
    static int[][] dp;
    public int longestCommonSubsequence(String s1, String s2) {
       int n = s1.length();
       int m = s2.length();

       dp = new int[n+1][m+1];
       for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
       }
       return find(s1,s2,0,0);
    }

    public int find(String s1,String s2,int i ,int j){

        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
   
       if(dp[i][j]!=-1) return dp[i][j];

       if(s1.charAt(i) == s2.charAt(j)){
         return 1+find(s1,s2,i+1,j+1);
       }
         
        return dp[i][j] = Math.max(find(s1,s2,i+1,j),find(s1,s2,i,j+1));
      

    }
}