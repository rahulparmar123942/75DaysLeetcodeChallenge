class Solution {
    public String reversePrefix(String word, char ch) {

          char[] arr = word.toCharArray();
        StringBuilder sb = new StringBuilder(word);
       
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==ch){
                String reversed = sb.substring(0,i+1);
                sb.replace(0,i+1,new StringBuilder(reversed).reverse().toString());
                break;
            }
        }
        return sb.toString();
    }
}