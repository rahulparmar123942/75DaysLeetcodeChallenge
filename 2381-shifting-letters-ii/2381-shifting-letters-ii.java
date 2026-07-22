class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
       
       int n = s.length();
       int[] diff = new int[n+1];
        
        for(int i=0;i<shifts.length;i++){
            int L = shifts[i][0];
            int R = shifts[i][1];
            int dir = shifts[i][2];

            int x;
            if(dir ==0)
                  x = -1;
            else
                x = 1;
            
            diff[L] +=x;
            if(R+1<diff.length) diff[R+1] -=x;
        }
        for(int i=1;i<n;i++){
            diff[i] += diff[i-1];
        }

         char[] ch = s.toCharArray();
        for(int i =0;i<n;i++){
            int shift = diff[i]%26;

            if(shift<0){
                shift +=26;
            }
           ch[i] = (char)(((ch[i] - 'a') + shift) % 26 + 'a');
        }
        return new String(ch);
    }
}