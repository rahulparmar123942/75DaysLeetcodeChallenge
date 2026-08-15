class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       int n = nums.length;
       
       return solve(nums,target,0);
 }
    public int solve(int[] nums,int target,int i){

        if(i == nums.length){
            if( target == 0) return 1;
            else return 0;
        }

        int add = solve(nums,target-nums[i],i+1);
        int sub = solve(nums,target+nums[i],i+1);

        return add+sub;
    }
}