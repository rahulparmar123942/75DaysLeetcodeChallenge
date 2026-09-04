class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        

        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(arr);
    
        int diff =Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
           diff = Math.min(diff,arr[i]-arr[i-1]);
        }

        for(int i=1;i<n;i++){
               List<Integer> list = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i-1])==diff){

                 list.add(arr[i-1]);
                 list.add(arr[i]);
                 ans.add(list);
            }
        }
        
        return ans;
    }
}