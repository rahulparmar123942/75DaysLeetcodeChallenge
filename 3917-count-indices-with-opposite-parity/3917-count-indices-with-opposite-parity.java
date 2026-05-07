class Solution {
    public int[] countOppositeParity(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            int count =0;
            for(int j =i+1;j<n;j++){
                if(nums[i]%2!=0 && nums[j]%2==0){
                    count++;
                }
                else if(nums[i]%2==0 && nums[j]%2!=0){
                    count++;
                }
            }
                arr[i]=count;
            }
            return arr;
    }
}