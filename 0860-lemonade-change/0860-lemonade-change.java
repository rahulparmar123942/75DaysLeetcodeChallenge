class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int C5 =0,C10=0,C20=0;

        for(int i:bills){
            
            if(i==5) C5++;

            else if(i==10){
             if(C5==0) return false;
                C5--;
                C10++;
            }
            else{

                if(C5>0 && C10>0){
                    C5--;
                    C10--;
                }
                else if(C5>=3){
                    C5-=3;
                }else{
                    return false;
                }
            }
           
    }


        return true;
    }
}