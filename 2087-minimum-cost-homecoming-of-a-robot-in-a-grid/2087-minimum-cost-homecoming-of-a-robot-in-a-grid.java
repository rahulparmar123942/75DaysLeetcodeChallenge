class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        
      int sr = startPos[0];
      int sc = startPos[1];

      int hr = homePos[0];
      int hc = homePos[1];
       
       int cost =0;
      if(sr<hr){
       for(int i =sr+1;i<=hr;i++){
        cost +=rowCosts[i];
       }
      }else{
        for(int i= sr-1;i>=hr;i--){
            cost +=rowCosts[i];
        }
      }
      if(sc<hc){
        for(int j=sc+1;j<=hc;j++){
            cost +=colCosts[j];
        }
      }else{
        for(int j = sc-1;j>=hc;j--){
            cost += colCosts[j];
        }
      }
      return cost;
    }
}