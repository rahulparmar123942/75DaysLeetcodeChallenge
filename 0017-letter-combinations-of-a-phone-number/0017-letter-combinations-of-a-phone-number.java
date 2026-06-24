class Solution {
    List<String> ans = new ArrayList<>();
      void pad(String p,String up){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
         int digit = up.charAt(0) - '0';

        if(digit ==0 || digit == 1){
            pad(p,up.substring(1));
            return;
        }
 int start, end;

        if (digit >= 2 && digit <= 6) {
            start = (digit - 2) * 3;
            end = start + 3;
        } 
        else if (digit == 7) {
            start = 15; // p
            end = 19;   // p q r s
        } 
        else if (digit == 8) {
            start = 19; // t
            end = 22;   // t u v
        } 
        else { // digit == 9
            start = 22; // w
            end = 26;   // w x y z
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    public List<String> letterCombinations(String digits) {
        
         if(digits.length()==0){
            return ans;
         }
         pad("",digits);
         return ans;
    }
}