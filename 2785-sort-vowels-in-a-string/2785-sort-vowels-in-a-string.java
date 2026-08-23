class Solution {// sime meri na approach sahi thi bs code likhne me galti ki 
    public String sortVowels(String s) {
        
        int n = s.length();
       StringBuilder sb = new StringBuilder();
       char[] arr = new char[n];
        int k=0;
       for(int i=0;i<n;i++){
        if( s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U'){
              arr[k++] = s.charAt(i);
         }
       }
       Arrays.sort(arr,0,k);
      
      k =0;
      for(int j=0;j<n;j++){
        
           if( s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' || s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I'|| s.charAt(j)=='O' || s.charAt(j)=='U'){
            sb.append(arr[k++]);
           }
          else sb.append(s.charAt(j));
       }
       return sb.toString();
    }
}