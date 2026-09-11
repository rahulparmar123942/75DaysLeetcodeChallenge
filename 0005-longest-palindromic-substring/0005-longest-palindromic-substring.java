class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();

       String rest = "";
       for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
            
            if(isPalindrome(s,i,j)){
                if((j-i+1)>rest.length()){
                rest = s.substring(i,j+1);
                }
            }
          }
       }
          return rest;
       
    }
     boolean isPalindrome(String s,int l ,int r){

            
             while(l<r){

                if(s.charAt(l)!=s.charAt(r)){
                  return false;
                }
                l++;
                r--;
             }
             return true;
     }
}