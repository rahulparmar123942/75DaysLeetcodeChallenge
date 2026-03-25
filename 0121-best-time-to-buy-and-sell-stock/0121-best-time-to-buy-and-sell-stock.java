class Solution {
    public int maxProfit(int[] price) {
       int n = price.length;
       int profit = 0;
       int cost;
       int min=price[0];
       for(int i =1;i<n;i++){
         cost = price[i]-min;
         profit = Math.max(profit,cost);
         min = Math.min(price[i],min);

       }
       return profit;
  }
}