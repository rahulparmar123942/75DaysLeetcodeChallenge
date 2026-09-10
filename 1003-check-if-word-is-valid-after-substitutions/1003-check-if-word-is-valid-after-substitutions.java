class Solution {
    public boolean isValid(String s) {
        
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(char ch:s.toCharArray()){

            st.push(ch);
            if(st.size()>=3){

               if(st.get(st.size()-3)=='a' && st.get(st.size()-2)=='b' && st.get(st.size()-1)=='c'){
                  st.pop();
                  st.pop();
                  st.pop();
               }
            }
        }
           return (st.size()==0);
    }
}