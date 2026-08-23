class Solution {
    public String reverseVowels(String s) {
        
        int n = s.length();

        int i=0;
        int j = n-1;
        
        StringBuilder sb = new StringBuilder(s);
        while(i<j){

            while(i<j && s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I'&& s.charAt(i)!='O' && s.charAt(i)!='U'){
                i++;
            }
             while(i<j && s.charAt(j)!='a' && s.charAt(j)!='e' && s.charAt(j)!='i' && s.charAt(j)!='o' && s.charAt(j)!='u' && s.charAt(j)!='A' && s.charAt(j)!='E' && s.charAt(j)!='I'&& s.charAt(j)!='O' && s.charAt(j)!='U'){
                j--;
            }
            
           char temp = s.charAt(i);
           sb.setCharAt(i, sb.charAt(j));
           sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}