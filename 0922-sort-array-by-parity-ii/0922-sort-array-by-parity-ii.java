class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans1.add(nums[i]);
            }else{
                ans2.add(nums[i]);
            }
        }
        
        int even =0;
        int odd =0;
        for(int j =0;j<n;j++){
           if(j%2==0) nums[j] = ans1.get(even++);
           else nums[j] = ans2.get(odd++);
        }
        return nums;
    }
}