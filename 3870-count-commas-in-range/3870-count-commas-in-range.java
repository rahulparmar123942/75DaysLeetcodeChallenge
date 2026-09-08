class Solution {
    public int countCommas(int n) {
       int count =0;
       int s = n;
       while(n>0){
        int digit = n%10;
        n = n/10;
        count++;
       }

       if(count<4) return 0;
       
        int ans =0;
         for(int i= 1000;i<=s;i++){
            ans++;
         }
       
       return ans;
    }
}