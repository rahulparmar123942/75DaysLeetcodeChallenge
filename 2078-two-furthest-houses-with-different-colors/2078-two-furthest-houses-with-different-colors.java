class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        int max =0;
        
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
            if(arr[i]<arr[j] || arr[i]>arr[j]){
                max = Math.max(max,j-i);
            }
        }
     }
     return max;
    }
}