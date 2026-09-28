class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
       int n = intervals.length;
       Arrays.sort(intervals,(a,b)->a[1]-b[1]);

       int[] start = new int[n];
       int[] end = new int[n];

       for(int i=0;i<n;i++){
        start[i] = intervals[i][0];
        end[i] = intervals[i][1];
       }
       
       int lastEnd = end[0];
       int remove = 0;
       
       for(int i=1;i<n;i++){
         
         if(start[i]<lastEnd){
            remove++;
         }else{
            lastEnd = end[i];
         }
       }
       return remove;
    }
}