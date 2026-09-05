class Solution {
    // static int[][]dp;
    public int minimizeMax(int[] nums, int p) {
        
          int n = nums.length;

          Arrays.sort(nums);

          int low = 0;
          int high = nums[n-1]-nums[0] ;
          
          int result = Integer.MAX_VALUE;

          while(low<=high){

            int mid = low+(high-low)/2;
            
            if(isValid(nums,p,mid)){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
          }

          return result;
    }
         boolean isValid(int[] nums,int p,int max){
            int i=0;
            int countPairs =0;
            while(i<nums.length-1){
            if(nums[i+1]-nums[i]<=max){
                  countPairs++;
                  i+=2;
            }else{
                i++;
            }
            }
            return countPairs>=p;
         }
}
    //     Arrays.sort(nums);
    //     int n = nums.length;
       
    //    dp = new int[n+1][p+1];

    //    for(int i=0;i<n;i++){
    //     Arrays.fill(dp[i],-1);
    //    }

    //    return solve(nums,p,0);
    // }
    // public int solve(int[] nums,int p,int idx){


    //     if(p==0){
    //         return 0;
    //     }

    //     if(idx>=nums.length-1){
    //         return Integer.MAX_VALUE;
    //     }

    //     if(dp[idx][p]!=-1){
    //         return dp[idx][p];
    //     }

    //     int skip = solve(nums,p,idx+1);

    //     int diff = nums[idx+1]-nums[idx];

    //     int take = solve(nums,p-1,idx+2);

    //     int ans = Math.max(diff,take);

    //     return dp[idx][p] = Math.min(skip,ans);
  