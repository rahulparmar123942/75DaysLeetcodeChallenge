class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int idx = 0;
        for(int num:nums){
            if(num<pivot){
                arr.add(num);
        }
    }
        for(int num:nums){
            if(num==pivot){
                arr.add(num);
            }
        }
        for(int num:nums){
            if(num>pivot){
                arr.add(num);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i =0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}