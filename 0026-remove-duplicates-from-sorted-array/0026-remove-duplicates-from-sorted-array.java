class Solution {
    public int removeDuplicates(int[] num) {
        int n = num.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(num[j]!=num[i]){
                num[++j]=num[i];
            }
        }
        return j+1;
    }
}