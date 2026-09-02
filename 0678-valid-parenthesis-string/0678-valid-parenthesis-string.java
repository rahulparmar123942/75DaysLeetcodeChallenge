class Solution {
    static boolean[][] dp;
    public boolean checkValidString(String s) {
        int n = s.length();
         
        dp = new boolean[n][n+1];
        boolean[][] visited = new boolean[n][n+1];
       return solve(s,0,0,visited);
    }
    public boolean solve(String s,int idx,int cnt,boolean[][] visited){
         int n = s.length();

         dp = new boolean[n][n+1];
         
     if(cnt<0) return false;

     if(idx == n) {
         return (cnt==0);
      }
      if(visited[idx][cnt]){
        return dp[idx][cnt];
      }
      visited[idx][cnt] =true;
    
    if(s.charAt(idx) == '('){
        return dp[idx][cnt]=solve(s,idx+1,cnt+1,visited);
    }
    else if(s.charAt(idx) == ')'){
        return dp[idx][cnt]= solve(s,idx+1,cnt-1,visited);
    }else{
        return dp[idx][cnt] =solve(s,idx+1,cnt-1,visited) || solve(s,idx+1,cnt+1,visited) || solve(s,idx+1,cnt,visited);
    }
    }
}