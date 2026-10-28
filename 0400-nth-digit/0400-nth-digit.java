class Solution {
    public int findNthDigit(int n) {
        
        // String s = "";
        // for(int i=1;i<=n;i++){
        //      s +=i;
        // }
        // // s = "123";

       
        // return s.charAt(n-1)-'0';

        long count = 9;
        int digit = 1;
        int start = 1;

        while(n>count*digit){

            n -= count*digit;
            digit++;
            count *= 10;
            start *= 10;
        }

        long number = start + (n-1)/digit;
        int index = (n-1)%digit;

        return String.valueOf(number).charAt(index)-'0';
    }
}