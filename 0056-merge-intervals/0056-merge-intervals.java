class Solution {
    public int[][] merge(int[][] intervals) {
        
       
 Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
  int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i=0;i<n;i++){

            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
       
      
       int i=0;
       int j=0;
       ArrayList<int[]> ans = new ArrayList<>();
       while(i<n && j<n){
        
        int currentStart = start[i];
        int currentEnd = end[j];

       while(i<n && start[i]<=currentEnd){
          
          currentEnd = Math.max(currentEnd,end[i]);
          i++;
       }
       
       ans.add(new int[]{currentStart,currentEnd});
       j=i;
    }
      
       return ans.toArray(new int[ans.size()][]);
    }
}
// start[i][0] 
// start[i] = [1,2,8,15]
// end[i] = [3,6,10,18]
// 1<3 and currentEnd = 3, 2<6 currentend = 6 and 8<= 6 nahi hai 
//  
