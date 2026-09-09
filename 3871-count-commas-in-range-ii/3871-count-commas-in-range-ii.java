class Solution {
    public long countCommas(long n) {
       long count =0;
       if(n<=999)return 0;
        
        if(n>999 ) count += n-999;
        if(n>999999 ) count+=n-999999;
        if(n>999999999L) count += n-999999999L;
        if(n>999999999999L) count +=n-999999999999L;
        if(n == 1000000000000000L) count+=1;
       return count;
    }
}