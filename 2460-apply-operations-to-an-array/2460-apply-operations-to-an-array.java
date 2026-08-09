class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }else{
                continue;
            }
        }
        int idx =0;
        int end = n-1;
        for(int i =0;i<n;i++){
            if(nums[i]!= 0){
                nums[idx++] = nums[i];
            }
        }
        while(idx<n){
            nums[idx++] = 0;
        }
        return nums;
    }
}