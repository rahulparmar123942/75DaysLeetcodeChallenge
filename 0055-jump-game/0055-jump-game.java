class Solution {
    static int[]dp;
    public boolean canJump(int[] nums) {
       int n = nums.length;
     
       dp = new int[n+1];
       Arrays.fill(dp,-1);

       return solve(nums,0);
    }
    public boolean solve(int[] nums,int idx){
      
         if(idx >= nums.length-1){
            return true;
        }
        if(dp[idx] != -1) return dp[idx]==1;

        
        int maxJump =nums[idx];

        for(int i=1;i<=maxJump;i++){

            if(solve(nums,idx+i)){
                dp[idx] =1;
                return true;
            }
        }
        dp[idx] = 0;
        return false;
    }
}