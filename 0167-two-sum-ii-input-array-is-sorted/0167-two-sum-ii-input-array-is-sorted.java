class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
        int low =i+1;
        int high = n-1;
        int x = target-nums[i];
    
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==x){
                return new int[]{i+1,mid+1};
            }else if(nums[mid]<x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
    return new int[]{-1,-1};
    }
}