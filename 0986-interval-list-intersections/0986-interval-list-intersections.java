class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;
        List<List<Integer>> ans = new ArrayList<>();
        int i =0;int j =0;
       while(i<n && j<m){
           
           int start = Math.max(firstList[i][0],secondList[j][0]);
           int end = Math.min(firstList[i][1],secondList[j][1]);
           
           if(start<=end){
            ans.add(Arrays.asList(start,end));
           }
           if(firstList[i][1] <secondList[j][1]){
            i++;
           }else{
            j++;
           }
       }
       
       int[][] result = new int[ans.size()][2];

        for (int k = 0; k < ans.size(); k++) {
        result[k][0] = ans.get(k).get(0);
        result[k][1] = ans.get(k).get(1);
     }

      return result;
    }
}