class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int n = intervals.length;
        
        int[][] arr = new int[n+1][2];
       
        for( int i=0;i<n;i++){
           arr[i][0] = intervals[i][0];
           arr[i][1] = intervals[i][1];
        }


        arr[n][0] = newInterval[0];
        arr[n][1] = newInterval[1];

       Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
      
       int[] start = new int[n+1];
       int[] end = new int[n+1];
       
       for(int i=0;i<=n;i++){
        start[i] = arr[i][0];
        end[i] = arr[i][1];
       }
        int i=0;
        int j=0;

        ArrayList<int[]> ans = new ArrayList<>();
        while(i<n+1 && j<n+1){
           
           int currStart = start[i];
           int currEnd = end[j];
          
          i++;
           while(i<n+1 && start[i]<=currEnd){
              currEnd = Math.max(currEnd,end[i]);
              i++;
           }

            ans.add(new int[]{currStart,currEnd});
            j=i;                
        }
        return ans.toArray(new int[ans.size()][]);
    }
}


// start = [1,2,6]
// end = [3,5,9]
// 1<3 currEnd = 3 and 


