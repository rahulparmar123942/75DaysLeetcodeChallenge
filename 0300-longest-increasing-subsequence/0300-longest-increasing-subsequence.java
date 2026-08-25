class Solution {
    static int[][] dp;
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        dp = new int[n][n+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,0,-1);
    }
    public int solve(int[] nums,int idx,int prev){

        int n = nums.length;
        
        if(idx == n){
            return 0;
        }

        if(dp[idx][prev+1]!=-1)return dp[idx][prev+1];
         int skip = solve(nums,idx+1,prev);

        int take = 0;
        if(prev==-1 || nums[idx]>nums[prev]){
         take = 1+solve(nums,idx+1,idx);
        }

        return dp[idx][prev+1] =  Math.max(take,skip);
    }
}