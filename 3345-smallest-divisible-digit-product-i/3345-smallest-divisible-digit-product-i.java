class Solution {
    public int digit(int n,int t ){
        int product =1;
        int s = n;
        while(s>0){
             int rem = s%10;
             product = product * rem;
             s = s/10;
        }
        if(product%t==0) return n;
        return digit(n+1,t);
    }
    public int smallestNumber(int n, int t) {
        int find = 0;
        for(int i =n;i<=100;i++){
             find = digit(i,t);
             break;
        }
        return find;
    }
}