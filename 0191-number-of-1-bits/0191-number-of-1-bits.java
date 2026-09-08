class Solution {
    public int hammingWeight(int n) {
        
        String s = "";
        while(n>0){

            if(n%2!=0) {
                s += '1';
            }
            else{
                s+='0';
            }
            n=n/2;
        }
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count++;
        }
        return count;
    }
}