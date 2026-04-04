class Solution {

    private static void subsetsWithDup(int[] arr,List<Integer>temp,int idx,List<List<Integer>>result){
       result.add(new ArrayList<>(temp));
       for(int i =idx;i<arr.length;i++){
       if(i>idx && arr[i]==arr[i-1]) continue;
       temp.add(arr[i]);
        subsetsWithDup(arr,temp,i+1,result);
        temp.remove(temp.size()-1);
       } 
    }
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        subsetsWithDup(arr,new ArrayList<>(),0,result);
        return result;
    }
}