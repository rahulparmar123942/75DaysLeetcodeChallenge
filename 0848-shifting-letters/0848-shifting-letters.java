class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        int m = s.length();
        long sum =0;

        StringBuilder sb  = new StringBuilder();

        for(int i =0;i<n;i++){
            sum +=shifts[i];
        }

       if(sum>26) sum = sum%26;
        for(int j =0;j<m;j++){
            char ch = (char)((s.charAt(j)-'a'+sum)%26 +'a');
            sb.append(ch);
    
            sum =(sum-shifts[j])%26;
            if(sum<0){
                sum +=26;
            }
        }
         return sb.toString();
    }
}