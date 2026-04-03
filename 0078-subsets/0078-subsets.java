class Solution{
    private static void subsets(int[] arr ,List<Integer>temp,int idx,List<List<Integer>>result){
        
        result.add(new ArrayList<>(temp));
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);

        subsets(arr,temp,i+1,result);

        temp.remove(temp.size()-1);//backtracking
        } 
    }
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
       subsets(arr,new ArrayList<>(),0,result);
       return result;
    }
}