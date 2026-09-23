class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

         prefix[0] = 1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}
// prefix[0] = 1 
// prefix[1] = 1*2 = 2
// prefix[2] = 2*3 = 6
// prefix[3] = 6*4 = 24

// suffix[3] = 4*3=12
// suffix[2] = 12*2 = 24
// suffix[1] = 24*2 = 48
//suffix[0] = 48*1 = 48