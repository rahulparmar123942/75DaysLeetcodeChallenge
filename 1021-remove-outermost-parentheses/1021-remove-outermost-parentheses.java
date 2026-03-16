class Solution {
    public String removeOuterParentheses(String s) {
       String ans ="";
       int c1=0;
       int c2=0;
        for(char c:s.toCharArray()){
            if(c=='(') {
                c1++;
                if(c1>(c2+1)){
                    ans +=c;
                }
            }else {
                c2++;
                if(c2<c1){
                    ans +=c;
                }
            }
        }
        return ans;
    }
}