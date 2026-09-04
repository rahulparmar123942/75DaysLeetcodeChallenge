class Solution {
    public int splitArray(int[] nums, int k) {
         int n = nums.length;

        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
        }

        int sum =0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }

        int low=max;
        int high=sum;
       
        int result =0;
        while(low<=high){

            int mid = low+(high-low)/2;

            if(isValid(nums,k,mid)==true){
                 result = mid;
                 high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
    public boolean isValid(int[] nums,int k,int max){
        
        int n = nums.length;
        
        int student = 1;
        int sum =0;
        for(int i=0;i<n;i++){
         sum+= nums[i];
        
        if(sum>max){
           student++;
           sum = nums[i];
        }
        
        if(student>k) return false;
        }
        
        return true;
    }
}