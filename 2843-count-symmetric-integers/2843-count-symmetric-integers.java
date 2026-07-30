class Solution {
    // public int findDigit(int n ){
    //     int count =0;
        
    //     while(n>0){
    //         int digit = n%10;
    //          n = n/10;
    //          count++;
    //     }
    //     return count;
    // }
    public int countSymmetricIntegers(int low, int high) {
        
        int count =0 ;
        for(int num=low;num<=high;num++){

            String s = String.valueOf(num);
            if(s.length()%2!=0) continue;
            
            int leftSum =0;
            int rightSum =0;

            int mid = s.length()/2;
            for(int i=0;i<mid;i++){
                leftSum += s.charAt(i)-'0';
            }
            for(int j=mid;j<s.length();j++){
                rightSum +=s.charAt(j)-'0';
            }
            if(leftSum == rightSum ){
                count++;
            }
        }
        return count;
    }
}