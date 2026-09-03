class Solution {
    public int partitionDisjoint(int[] nums) {
        
        int n = nums.length;
        
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        leftMax[0] = nums[0];
        

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1] ,nums[i]);
        }

        rightMin[n-1] = nums[n-1];

        for(int j=n-2;j>=0;j--){

            rightMin[j] = Math.min(rightMin[j+1],nums[j]);

           
        }
        for(int i=1;i<n;i++){
            if(leftMax[i-1]<=rightMin[i]) return i;
        }
       return n;
    }
}
