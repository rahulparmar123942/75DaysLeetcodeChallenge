class Solution {
    public boolean isGood(int[] arr) {
        int n = arr.length;
        int count =0;
        int max =0;
        Arrays.sort(arr);
        for(int i =0;i<n-1;i++){
           if(arr[i]!=i+1){
            return false;
           }
        }
        return arr[n-1] ==n-1;
    }
}