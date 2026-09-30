class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration){

      int n = timeSeries.length;
     
     if(duration==0) return 0;
       int count = 0 ;
      for(int i=0;i<n-1;i++){
        
        int diff = timeSeries[i+1] - timeSeries[i];
        if(diff>=duration){
            count+=duration;
        }else{
            count+=diff;
        }
      }
        count+=duration;
      
      return count;
    }
}
// timeSeries = [ 1,4]  duration = 2;
// 4-1 = 3 3>2 therefore count+=duration
// diff>= 2 hai to count += duration 