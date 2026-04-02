class Solution {

    List<List<Integer>> result = new ArrayList<>();
    public void sum(int[] arr,int target,List<Integer>temp,int idx){
    if( target == 0 ){
      result.add(new ArrayList<>(temp));
      return;
    }
    if(idx==arr.length||target<0){
        return;
    }
    temp.add(arr[idx]);
    sum(arr,target-arr[idx],temp,idx);
    temp.remove(temp.size()-1);
    sum(arr,target,temp,idx+1);
}

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        sum(arr,target,new ArrayList<>(),0);
        return result;
    }
}