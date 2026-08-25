class Solution {

    static int[][] dp;
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        dp = new int[nums.size()][target+1];
        for(int i=0;i<nums.size();i++){
            Arrays.fill(dp[i],-2);
        }
        return solve(nums,target,0);
        
    }   
    public int solve(List<Integer>nums,int target,int idx){
        
       
        if(target==0){
            return 0;
        }
       
        if(idx==nums.size()){
            return -1;
        }
        if(dp[idx][target]!=-2) return dp[idx][target];

       int nottake = solve(nums,target,idx+1);

        int take =-1;
       if(nums.get(idx)<=target){
        
          int result = solve(nums,target-nums.get(idx),idx+1);

        if(result!=-1){
            take = 1+result;
        }
       }
        return dp[idx][target] = Math.max(take,nottake);
    }
}