class Solution {

    void find(int[] arr,int q,List<Integer>ans){
       int sum =0;
       for(int i=0;i<arr.length;i++){
          sum += arr[i];
          if(sum>q){
             ans.add(i);
              return;
          }
       }
       ans.add(arr.length);
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int m = queries.length;
        
       
       Arrays.sort(nums);
        
        for(int q:queries){
            find(nums,q,ans);
        }

        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}