class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length;
        int end = n-1;
        for(int i=0;i<=end;i++){
             if(nums[i] == val){
                nums[i] = nums[end];
                end--;
                i--;
             }
             
        }
        return end+1;
    }
}