class Solution {
    private void sum(int[] arr,int idx,int target,List<Integer>temp,List<List<Integer>>ans){
      if(target==0){
        ans.add(new ArrayList<>(temp));
        return;
      }
      if(idx==arr.length || target<0){
        return;
      }
      temp.add(arr[idx]);
      sum(arr,idx,target-arr[idx],temp,ans);
      temp.remove(temp.size()-1);
      sum(arr,idx+1,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        sum(arr,0,target,new ArrayList<>(),ans);
        return ans;
    }
}