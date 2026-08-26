class Solution {
    static long[][] dp;
    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;

        dp = new long[n][2];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,0,true);
        
    }
    public long solve(int[] nums,int idx,Boolean flag){

        if(idx >= nums.length){
            
                return 0;
            
        }
          int f = flag ? 1 : 0;

        if(dp[idx][f]!=-1) return dp[idx][f];
        long skip = solve(nums,idx+1,flag);

        long value = nums[idx];
        
        if(flag==false){
            value = -value;
        }
        long pick = solve(nums,idx+1,!flag)+value;
        return dp[idx][f] =Math.max(pick,skip);
    }
}