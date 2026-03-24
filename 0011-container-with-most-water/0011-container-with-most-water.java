class Solution {
    public int maxArea(int[] heights) {
        int n =heights.length;
        int lp = 0;
        int rp = n-1;
        int maxArea = 0;
      while(lp<rp){
         int  width =rp-lp;
        int h = Math.min(heights[lp],heights[rp]);
        int currArea = width*h;
         maxArea= Math.max(currArea,maxArea);
        if(heights[lp]<heights[rp]){
           lp++; 
        }
        else{
            rp--;
        }
    
      }
      return maxArea;
    }
}