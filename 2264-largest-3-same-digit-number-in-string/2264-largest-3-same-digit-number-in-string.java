class Solution {
    public String largestGoodInteger(String num) {
        
        int n = num.length();

        char[] ch = num.toCharArray();
        
        int count =1;
        String max = "";
        for(int i=n-1;i>0;i--){
            if( ch[i] == ch[i-1]){
                 count++;
            }else{
                count =1;
            }
              
              if(count == 3){
               String current = "" +ch[i]+ch[i]+ch[i];

               if(max.equals("") || ch[i]>max.charAt(0)){
                max = current ;
               }
              }

        }

       return max;
      
    }
}